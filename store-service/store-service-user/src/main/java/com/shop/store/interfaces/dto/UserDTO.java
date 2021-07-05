package com.shop.store.interfaces.dto;

import lombok.Data;

@Data
public class UserDTO {

    private String userName;

    public UserDTO(String userName) {
        this.userName = userName;
    }
    public String toString() {
        return "UserDTO(userName="+this.getUserName()+")";
    }
}
