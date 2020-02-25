package com.london.tribune.mapper;

import com.london.tribune.model.User;

public interface UserMapper {

    User selectByPrimaryKey(Integer id);
}