package com.example.PP_3_1_1.service;

import com.example.PP_3_1_1.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.PP_3_1_1.repository.UserRepository;

import java.util.List;

@Service
public class UserService {
    private final UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User findById(Long id){
        return userRepository.getOne(id);
    }

    public List<User> findAllUsers(){
        return userRepository.findAll();

    }

    public User saveUser (User user){
        return userRepository.save(user);
    }

    public void deleteUserById (Long id){
        userRepository.deleteById(id);

    }
}