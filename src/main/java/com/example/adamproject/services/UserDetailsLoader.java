package com.example.adamproject.services;

import com.example.adamproject.models.User;
import com.example.adamproject.models.UserWithRoles;
import com.example.adamproject.repositories.UserRepository;

import org.springframework.stereotype.Service;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

@Service
public class UserDetailsLoader implements UserDetailsService {

    private final UserRepository usersDao;

    public UserDetailsLoader(UserRepository usersDao) {
        this.usersDao = usersDao;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = usersDao.findByUsername(username);
        if(user == null){
            throw new UsernameNotFoundException("No User Found for Username: "+username);
        }
        return new UserWithRoles(user);
    }
}
