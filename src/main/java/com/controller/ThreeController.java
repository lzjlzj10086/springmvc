package com.controller;

import com.entity.User;
import com.entity.VO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 获得请求数据
 * 自定义类型转换器没弄
 */
@Controller
@RequestMapping("demo03")
public class ThreeController {

    /**
     * 普通数据获取
     * @param name
     * @param age
     */
    @RequestMapping("request")
    public String request(String name,int age){
        System.out.println(name);
        System.out.println(age);
        return "success";
    }
    /**
     * pojo获取
     */
    @PostMapping("request02")
    public String request(User user){
        System.out.println(user);
        return "success";
    }
    /**
     * 集合获取,一般有新建个类，里面封装集合对象
     */
    @PostMapping("request03")
    public String request03(VO vo){
       System.out.println(vo);
        return "success";
    }
    /**
     * 集合获取,利用ajax，json情景
     * 服务器只需加上注解@RequestBody
     */
    @PostMapping("request04")
    public String request04(@RequestBody List<User> userList){
        System.out.println(userList);
        return "success";
    }
    /**
     *参数绑定注解，，当请求参数和业务controller参数不一致时
     * 需要@RequestParam注解绑定
     */
    @RequestMapping("request05")
    public String request05(@RequestParam("username") String name){
        System.out.println(name);
        return "success";
    }

    /**
     * 获得请求头
     * @return
     * @RequestHeader
     * @CookieValue 获取cookie
     */
    @RequestMapping("request06")
    public String request06(@RequestHeader(value = "User_Agent",required = false)String user_Agent){
        System.out.println(user_Agent);
        return "success";
    }
}
