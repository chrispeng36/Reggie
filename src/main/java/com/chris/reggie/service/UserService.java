package com.chris.reggie.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.chris.reggie.entity.User;

/**
 * @author ChrisPeng
 * @date 2022/11/12 10:46
 */
public interface UserService extends IService<User> {
    //发送邮件
    void sendMsg(String to, String subject, String text);
}
