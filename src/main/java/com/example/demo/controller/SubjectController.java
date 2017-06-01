package com.example.demo.controller;

import com.example.demo.entity.Subject;
import com.example.demo.entity.User;
import com.example.demo.services.SubjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by 潮汐 on 2017/5/27.
 */
@Controller
@RequestMapping(value = "/subject")
public class SubjectController {

    @Autowired
    private SubjectService subjectService;

//    @ModelAttribute("subject")
//    public Subject createModel() {
//        return new Subject();
//    }

    @RequestMapping(value = "/save",method = RequestMethod.POST)
    public String saveSubject(Subject subject){
        subjectService.saveSubject(subject);
        return "/section/{sectionName}/list";
    }


}


