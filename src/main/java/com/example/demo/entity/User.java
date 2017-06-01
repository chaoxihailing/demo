package com.example.demo.entity;
        import com.fasterxml.jackson.annotation.JsonIgnore;
        import org.hibernate.validator.constraints.Email;
        import org.hibernate.validator.constraints.Length;
        import org.hibernate.validator.constraints.NotBlank;
        import org.hibernate.validator.constraints.Range;
        import org.springframework.format.annotation.DateTimeFormat;

        import javax.persistence.*;
        import javax.validation.constraints.NotNull;
        import javax.xml.crypto.Data;
        import java.time.LocalDateTime;
        import java.util.Date;

/**
 * Created by 潮汐 on 2017/5/13.
 */
@Entity
@Table(name = "ye_user")
public class User {
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column
    @NotNull
    @Length(min = 6, max = 10)
    private  String loginName;

    @Length(min = 6, max = 10)
    @Column
    private String name;

    @NotNull
    @Column
    private  String password;

    @Column
    private  String salt;

    @Column
    private  String roles;

    @Column
    private LocalDateTime registerDate;

    @Column
    private String email;

    public User() {
    }

    public User(String loginName, String name, String password, String salt, String roles, LocalDateTime registerDate, String email) {
        this.loginName = loginName;
        this.name = name;
        this.password = password;
        this.salt = salt;
        this.roles = roles;
        this.registerDate = registerDate;
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    public LocalDateTime getRegisterDate() {
        return registerDate;
    }

    public void setRegisterDate(LocalDateTime registerDate) {
        this.registerDate = registerDate;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", loginName='" + loginName + '\'' +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", salt='" + salt + '\'' +
                ", roles='" + roles + '\'' +
                ", registerDate=" + registerDate +
                ", email='" + email + '\'' +
                '}';
    }
}

