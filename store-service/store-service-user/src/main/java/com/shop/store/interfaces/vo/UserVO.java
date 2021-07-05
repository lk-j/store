package com.shop.store.interfaces.vo;

import lombok.Data;

@Data
public class UserVO {
    private String userName;

    public UserVO(String userName) {
        this.userName = userName;
    }
    public String toString() {
        return "UserVO(userName="+this.getUserName()+")";
    }
}
