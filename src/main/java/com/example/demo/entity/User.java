package com.example.demo.entity;
        import javax.persistence.Entity;
        import javax.persistence.Table;
        import javax.xml.crypto.Data;

/**
 * Created by 潮汐 on 2017/5/13.
 */
@Entity
@Table
public class User {
    private Integer id;
    private  String login_name;
    private  String name;
    private  String password;
    private  String salt;
    private  String roles;
    private Data register_date;

    public User() {
    }

    public User(Integer id, String login_name, String name, String password, String salt, String roles, Data register_date) {
        this.id = id;
        this.login_name = login_name;
        this.name = name;
        this.password = password;
        this.salt = salt;
        this.roles = roles;
        this.register_date = register_date;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLogin_name() {
        return login_name;
    }

    public void setLogin_name(String login_name) {
        this.login_name = login_name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }

    public String getRoles() {
        return roles;
    }

    public void setRoles(String roles) {
        this.roles = roles;
    }

    public Data getRegister_date() {
        return register_date;
    }

    public void setRegister_date(Data register_date) {
        this.register_date = register_date;
    }
}

