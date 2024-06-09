package com.davidnguyen.springsecurityjwt.service.impl;

import com.davidnguyen.springsecurityjwt.entity.User;
import com.davidnguyen.springsecurityjwt.repository.UserRepository;
import com.davidnguyen.springsecurityjwt.service.UserService;
import org.springframework.stereotype.Component;

@Component
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public boolean existByUsername(String username) {
        return userRepository.existsByUsername(username);
    }

    @Override
    public boolean existByEmail(String email) {
        return userRepository.existsByEmail(email);
    }

    @Override
    public void save(User user) {
        userRepository.save(user);
    }
}
