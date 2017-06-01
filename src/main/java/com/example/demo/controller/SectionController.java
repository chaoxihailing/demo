package com.example.demo.controller;

import com.example.demo.entity.Section;
import com.example.demo.entity.Subject;
import com.example.demo.entity.User;
import com.example.demo.services.SectionService;
import com.example.demo.services.SubjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

/**
 * Created by 潮汐 on 2017/5/24.
 */
@Controller
@RequestMapping(value = "/section")
@SessionAttributes("pet")
public class SectionController {

    @Autowired
    private SectionService sectionService;

    @Autowired
    private SubjectService subjectService;

    @RequestMapping(value = "/list")
    public String listSection(Model model){
        model.addAttribute("result",sectionService.listSection());
        return "views/section/listSection";
    }

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public String saveSection(Section section){
        sectionService.saveSection(section);
        return "redirect:/section/list";

    }

    @RequestMapping(value = "/{sectionName}/list")
    public String listSubject(@PathVariable("sectionName") String sectionName, Model model){
            model.addAttribute("result",subjectService.findBySectionName(sectionName));
            return "views/subject/listSubject";

    }



}
