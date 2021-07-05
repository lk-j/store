package com.shop.store.domain.repository;

import com.shop.store.domain.entity.UserEntity;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository {
    UserEntity findByUserId(String userId);
}
