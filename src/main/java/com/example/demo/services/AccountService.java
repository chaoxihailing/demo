package com.example.demo.services;

import com.example.demo.entity.User;
import com.example.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springside.modules.utils.security.CryptoUtil;
import org.springside.modules.utils.text.EncodeUtil;
import org.springside.modules.utils.text.HashUtil;

import javax.transaction.Transactional;

/**
 * Created by 潮汐 on 2017/5/13.
 */
@Service
@Transactional
public class AccountService {
    @Autowired
    private UserRepository userRepository;

//    @Transactional
//    public void registerUser(String email, String loginName, String password){
////        todo 需要对信息的验证
//        User user = new User();
//        user.setEmail(email);
//        user.setLoginName(loginName);
//        user.setPassword(hashPassword(password));
//        userRepository.save(user);
//    }
    @Transactional
    public void registerUser(User user){
        user.setEmail(user.getLoginName());
        user.setLoginName(user.getLoginName());
        user.setPassword(hashPassword(user.getPassword()));
        userRepository.save(user);
    }

    public static String hashPassword(String password){
        return EncodeUtil.encodeBase64(HashUtil.sha1(password));
    }
}
