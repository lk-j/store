package com.shop.store.domain.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name="user")
public class UserEntity {
    @Id
    private String userId;

    private String userName;
}
