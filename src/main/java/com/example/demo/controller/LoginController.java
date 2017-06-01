package com.example.demo.controller;

import com.example.demo.entity.User;
import com.example.demo.repository.UserRepository;
import com.example.demo.services.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

/**
 * Created by 潮汐 on 2017/5/16.
 */
@Controller
@RequestMapping(value = "/login")
public class LoginController {
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private AccountService accountService;

    @RequestMapping(method = RequestMethod.GET)
    public String login(){
        return "views/login";
    }

//    @RequestMapping(method = RequestMethod.POST)
//    public String login(String loginName, String password, Model model, RedirectAttributes redirectAttributes) {
//        if (loginName != null) {
//            User user = userRepository.findByLoginName(loginName);
//            if (user != null) {
////                hashPassword需要public的修饰，可以觉得应该是自身调用的方法，应该可以使用protect修饰符才对，可是出错了
//                String hashPassword = accountService.hashPassword(password);
//                if (hashPassword.equals(user.getPassword())) {
//                    return "views/index";
//                }
//            }
//            return "views/login";
//        }
//        return "views/login";
//    }
    @RequestMapping(method = RequestMethod.POST)
    public String login(User user, Model model, RedirectAttributes redirectAttributes) {
       if (user != null){
           User result = userRepository.findByLoginName(user.getLoginName());
           if (result != null){
               String hashPassword = accountService.hashPassword(user.getPassword());
//               在输入密码为String
                if (hashPassword.equals(result.getPassword())){
                    return "views/index";
                }
           }
           return "views/login";
       }
       return  "views/login";
    }
}
