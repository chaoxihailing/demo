package com.example.demo.entity;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Date;

/**
 * Created by 潮汐 on 2017/5/24.
 */
@Entity
@Table(name = "ye_section")
public class Section {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column
    private String name;

    @Column
    private LocalDateTime createDate;

    @Column
    private LocalDateTime archivingDate;

    public Section(String name) {
        this.name = name;
    }

    public Section() {
    }

    public Section(String name, LocalDateTime createDate, LocalDateTime archivingDate) {
        this.name = name;
        this.createDate = createDate;
        this.archivingDate = archivingDate;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDateTime getCreateDate() {
        return createDate;
    }

    public void setCreateDate(LocalDateTime createDate) {
        this.createDate = createDate;
    }

    public LocalDateTime getArchivingDate() {
        return archivingDate;
    }

    public void setArchivingDate(LocalDateTime archivingDate) {
        this.archivingDate = archivingDate;
    }

    @Override
    public String toString() {
        return "Section{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", createDate=" + createDate +
                ", archivingDate=" + archivingDate +
                '}';
    }
}



