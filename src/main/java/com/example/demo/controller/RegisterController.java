package com.example.demo.controller;

import com.example.demo.entity.User;
import com.example.demo.repository.UserRepository;
import com.example.demo.services.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;

/**
 * Created by 潮汐 on 2017/5/13.
 */

@Controller
@RequestMapping(value = "/register")
public class RegisterController {
    @Autowired
    private AccountService accountService;

    @Autowired
    private UserRepository userRepository;

    @ModelAttribute("user")
    public User createModel() {
        return new User();
    }

    @RequestMapping(method = RequestMethod.GET)
    public String register(){
        return "views/register";
    }

    @RequestMapping(method = RequestMethod.POST)
    public String register(@Valid User user, BindingResult bindingResult){
        if (bindingResult.hasErrors()) {
            return "views/register";
        }
        accountService.registerUser(user);
        return "views/login";
    }

    /**
     * Ajax请求校验loginName是否唯一。
     */
    @RequestMapping(value = "checkLoginName")
    @ResponseBody
    public String checkLoginName(@RequestParam("loginName") String loginName) {
        if (userRepository.findByLoginName(loginName) != null) {
            return "false";
        } else {
            return "true";
        }
    }


}
