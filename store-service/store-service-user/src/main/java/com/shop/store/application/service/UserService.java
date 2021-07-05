package com.shop.store.application.service;

import com.shop.store.domain.entity.UserEntity;
import com.shop.store.domain.repository.UserRepository;
import com.shop.store.interfaces.assembler.UserDTOAssembler;
import com.shop.store.interfaces.dto.UserDTO;
import com.shop.store.interfaces.dto.UserParamDTO;
import org.springframework.stereotype.Component;

@Component
public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public UserDTO getUserInfo(UserParamDTO userParamDTO) {
        UserEntity userEntity = userRepository.findByUserId(userParamDTO.getUserId());
        UserDTOAssembler userDTOAssembler = new UserDTOAssembler();
        return userDTOAssembler.toDTO(userEntity);
    }
}
