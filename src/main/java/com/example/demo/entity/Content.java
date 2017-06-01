package com.example.demo.entity;

import javax.persistence.*;
import java.time.LocalDateTime;

/**
 * Created by 潮汐 on 2017/5/24.
 */
@Entity
@Table(name = "ye_content")
public class Content {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column
    private  String comment;

    @ManyToOne
    @JoinColumn(name = "subject_id")
    private Subject subject;

    @Column
    private LocalDateTime createDate;

    @Column
    private LocalDateTime archivingDate;

    @OneToOne
    @JoinColumn(name = "user_id")
    private User user;

    public Content(String comment, Subject subject, LocalDateTime createDate, LocalDateTime archivingDate, User user) {
        this.comment = comment;
        this.subject = subject;
        this.createDate = createDate;
        this.archivingDate = archivingDate;
        this.user = user;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
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

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "Content{" +
                "id=" + id +
                ", comment='" + comment + '\'' +
                ", subject=" + subject +
                ", createDate=" + createDate +
                ", archivingDate=" + archivingDate +
                ", user=" + user +
                '}';
    }
}
