package com.shop.store.interfaces.assembler;

import com.shop.store.domain.entity.UserEntity;
import com.shop.store.interfaces.dto.UserDTO;

public class UserDTOAssembler {
    public UserDTO toDTO(UserEntity userEntity) {
        return new UserDTO(userEntity.getUserName());
    }
}
