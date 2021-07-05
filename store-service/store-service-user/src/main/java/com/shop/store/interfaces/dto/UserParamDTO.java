package com.shop.store.interfaces.dto;

import lombok.Data;

@Data
public class UserParamDTO {

    private String userId;

    public UserParamDTO(String userId) {
        this.userId = userId;
    }
    public String toString() {
        return "UserParamDTO(userId="+this.getUserId()+")";
    }
}
