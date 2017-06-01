package com.example.demo.repository;

import com.example.demo.entity.Subject;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by 潮汐 on 2017/5/24.
 */
public interface SubjectRepository extends JpaRepository<Subject, Integer> {
    public List<Subject> findAllBySection_Name(String sectionName);

}
