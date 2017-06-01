package com.example.demo.services;

import com.example.demo.entity.Section;
import com.example.demo.repository.SectionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by 潮汐 on 2017/5/24.
 */
@Service
public class SectionService {

    @Autowired
    private SectionRepository sectionRepository;

    public List<Section> listSection(){
        return sectionRepository.findAll();
    }

    public void saveSection(Section section){
        sectionRepository.save(section);
    }
}
