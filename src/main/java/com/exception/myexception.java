package com.exception;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 异常配置：
 * 1.直接在配置文件配置：SimpleMappingExceptionResolver
 * 2.
 */
@Controller
@RequestMapping("exception")
public class myexception {

    @RequestMapping("show")
    public String show(){
        int num = 10/0;
        return "success";
    }
}
