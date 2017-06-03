package com.example.demo.controller;

import com.example.demo.entity.Subject;
import com.example.demo.entity.User;
import com.example.demo.services.SubjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpSession;

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
    public String saveSubject(Subject subject, HttpSession httpSession){
        subjectService.saveSubject(subject);
        String sectionId = httpSession.getAttribute("sectionId").toString();
        return  "redirect:" + "/section/"+sectionId+"/list";
    }


}


