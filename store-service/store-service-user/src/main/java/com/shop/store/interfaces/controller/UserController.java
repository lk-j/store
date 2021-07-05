package com.shop.store.interfaces.controller;

import com.shop.store.application.service.UserService;
import com.shop.store.interfaces.assembler.UserVOAssembler;
import com.shop.store.interfaces.dto.UserParamDTO;
import com.shop.store.interfaces.vo.UserVO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * user controller
 */
@RestController
public class UserController {

    private final UserService userService;
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/user/info/{userId}")
    public UserVO getUserInfo(@PathVariable String userId) {
        UserVOAssembler userVOAssembler = new UserVOAssembler();
        return userVOAssembler.toDTO(userService.getUserInfo(new UserParamDTO(userId)));
    }
}
