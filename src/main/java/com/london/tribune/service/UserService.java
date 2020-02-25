package com.london.tribune.service;

import com.london.tribune.model.User;

public interface UserService {

    /**
     *
     * @return
     */
    User selectByPrimaryKey(Integer id);

}
