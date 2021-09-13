package com.thinklinux.user.service;

import com.thinklinux.user.entity.User;
import com.thinklinux.user.entity.UserDetail;

public interface UserService {
    User saveUser(User user);

    User getUserById(Long id);

    UserDetail getUserDetailById(Long id);
}
