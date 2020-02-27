package com.xw.myvalidated.data;

import com.xw.myvalidated.annotation.IdentityCardNumber;
import com.xw.myvalidated.service.assist.Update;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotNull;

public class User {

    @NotNull(message = "用户ID不能为空", groups = Update.class)
    private Long id;

    @NotNull(message = "用户名不能为空")
    @Length(max = 3, message = "用户名不能超过3个字符")
    private String username;

    @NotNull(message = "密码不能为空")
    private String password;

    @IdentityCardNumber(message = "身份证信息有误,请核对后提交")
    private String cardNo;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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

    public String getCardNo() {
        return cardNo;
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", cardNo='" + cardNo + '\'' +
                '}';
    }
}
