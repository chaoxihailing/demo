package com.example.demo.entity;

import javax.persistence.*;
import java.time.LocalDateTime;

/**
 * Created by 潮汐 on 2017/5/24.
 */
@Entity
@Table(name = "ye_subject")
public class Subject {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;


    @Column
    private String title;

    @Column
    private String content;

    @ManyToOne
    @JoinColumn(name = "section_id")
    private Section section;

    @Column
    private LocalDateTime createDate;

    @Column
    private LocalDateTime archivingDate;

    public Subject() {
    }

    public Subject(String title, String content) {
        this.title = title;
        this.content = content;
    }

    public Subject(String title, String content, Section section, LocalDateTime createDate, LocalDateTime archivingDate) {
        this.title = title;
        this.content = content;
        this.section = section;
        this.createDate = createDate;
        this.archivingDate = archivingDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Section getSection() {
        return section;
    }

    public void setSection(Section section) {
        this.section = section;
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
        return "Subject{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", section=" + section +
                ", createDate=" + createDate +
                ", archivingDate=" + archivingDate +
                '}';
    }
}
