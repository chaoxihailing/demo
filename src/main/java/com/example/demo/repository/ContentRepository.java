package com.example.demo.repository;

import com.example.demo.entity.Content;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by 潮汐 on 2017/5/24.
 */
public interface ContentRepository extends JpaRepository<Content,Integer> {
}
