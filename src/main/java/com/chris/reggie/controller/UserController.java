package com.chris.reggie.controller;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.chris.reggie.common.R;
import com.chris.reggie.entity.User;
import com.chris.reggie.service.UserService;
import com.chris.reggie.utils.ValidateCodeUtils;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang.StringUtils;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.Map;

/**
 * @author ChrisPeng
 * @date 2022/11/12 12:22
 */
@RestController
@RequestMapping("/user")
@Slf4j
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("/sendMsg")
    public R<String> sendMsg(@RequestBody User user, HttpSession session){
        //获取邮箱号
        //相当于发送短信定义的String to
        String email = user.getPhone();
        String subject = "瑞吉外卖";

        if (StringUtils.isNotEmpty(email)){
            //发送一个四位数的验证码，把验证码编程一个Stirng类型
            String code = ValidateCodeUtils.generateValidateCode(4).toString();
            String text = "【瑞吉外卖】您好，您的登录验证码为：" + code + "，请尽快登录";
            log.info("验证码为：" + code);
            //发送短信
            userService.sendMsg(email, subject, text);
            //将验证码保存到session中
            session.setAttribute(email, code);
            return R.success("验证码发送成功");
        }
        return R.error("验证码发送异常");
    }

    //登录
    @PostMapping("/login")
    //Map存JSON数据
    public R<User> login(HttpSession session, @RequestBody Map map){
        //获取邮箱，用户输入
        String phone = map.get("phone").toString();
        //获取验证码，用户输入的
        String code = map.get("code").toString();
        //获取session中保存的验证码
        Object sessionCode = session.getAttribute(phone);
        //如果session中保存的验证码和用会输入的验证码一样
        if (sessionCode != null && sessionCode.equals(code)){
            //要是User数据库没有这个邮箱则自动注册，先看看输入的邮箱是否存在数据库
            LambdaQueryWrapper<User> queryWrapper = new LambdaQueryWrapper<>();
            queryWrapper.eq(User::getPhone,phone);
            //获取唯一的用户，因为手机号是唯一的
            User user = userService.getOne(queryWrapper);
            //要是User数据库没有这个邮箱则自动注册
            if (user == null){
                user = new User();
                user.setPhone(phone);
                user.setStatus(1);
                //取邮箱的前五位为用户名
                user.setName(phone.substring(0, 6));
                userService.save(user);
            }
            //不保存这个用户名就登录不上去，因为过滤器需要得到这个user才能放行，程序才知道登陆了
            session.setAttribute("user", user.getId());
            return R.success(user);
        }
        return R.error("登录失败");
    }
}
