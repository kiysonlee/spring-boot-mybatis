package com.kiyson.boot.mapper.auth;

import com.kiyson.boot.entity.User;

import java.util.List;

public interface UserMapper {

    List<User> selectAll();
}
