package com.hutech.kt_b5.Services;

import com.hutech.kt_b5.Entities.User;
import com.hutech.kt_b5.Repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServices {
    @Autowired
    private UserRepository userRepository;

    public List<User> getAllUser() {return userRepository.findAll();}


}
