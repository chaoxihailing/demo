package com.example.demo.services;

import com.example.demo.entity.User;
import com.example.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springside.modules.utils.security.CryptoUtil;

import javax.transaction.Transactional;

/**
 * Created by 潮汐 on 2017/5/13.
 */
@Service
@Transactional
public class AccountService {

    @Autowired
    private UserRepository userRepository;

    public void registerUser(User user){

    }
}
