package com.kj.reggie.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.kj.reggie.entity.User;

public interface UserService extends IService<User> {
    public void sendMsg(String to,String subject,String context);
}
