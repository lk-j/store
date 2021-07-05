package com.shop.store.interfaces.assembler;

import com.shop.store.interfaces.dto.UserDTO;
import com.shop.store.interfaces.vo.UserVO;

public class UserVOAssembler {
    public UserVO toDTO(UserDTO userDTO) {
        return new UserVO(userDTO.getUserName());
    }
}
