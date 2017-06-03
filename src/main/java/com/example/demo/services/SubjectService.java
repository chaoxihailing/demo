package com.example.demo.services;

import com.example.demo.entity.Section;
import com.example.demo.entity.Subject;
import com.example.demo.repository.SubjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by 潮汐 on 2017/5/27.
 */
@Service
public class SubjectService {

    @Autowired
    private SubjectRepository subjectRepository;

    public List<Subject> findBySectionId(Integer sectionId){
        return subjectRepository.findAllBySectionId(sectionId);
    }

    public void saveSubject(Subject subject){
        subjectRepository.save(subject);
    }
}
