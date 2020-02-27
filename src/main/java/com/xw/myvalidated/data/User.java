package com.xw.myvalidated.data;

import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotNull;

public class User {

    private long id;

    @NotNull(message = "用户名不能为空")
    @Length(max = 3, message = "用户名不能超过3个字符")
    private String username;

    @NotNull(message = "密码不能为空")
    private String password;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
