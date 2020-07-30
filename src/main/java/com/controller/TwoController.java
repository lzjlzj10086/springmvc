package com.controller;

import com.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 数据回写
 */
@Controller
@RequestMapping("demo02")
public class TwoController {

    /**
     * @ResponseBody注解告诉springmvc不进行跳转，直接数据回写
     * 直接数据回写，不需要跳转
     * @return
     */
    @RequestMapping("response")
    @ResponseBody
    public String response(){
        return "hello springmvc";
    }
    /**
     * @ResponseBody注解告诉springmvc不进行跳转，直接数据回写
     * 直接数据回写，不需要跳转
     * 转换json字符串
     */
    @RequestMapping("response02")
    @ResponseBody
    public User response02(){
        User user = new User();
        user.setAge(34);
        user.setName("jgkfgkl");
        return user;
    }
}
