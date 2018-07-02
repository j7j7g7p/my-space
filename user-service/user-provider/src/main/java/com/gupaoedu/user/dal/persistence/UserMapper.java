package com.gupaoedu.user.dal.persistence;

import com.gupaoedu.user.dal.entity.User;

public interface UserMapper {

    /**
     *
     * @return
     */
    User getUserByUserName(String userName);

}
