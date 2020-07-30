package com.interceptor;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("interce")
public class TargetController {

    @RequestMapping("show")
    public ModelAndView show(ModelAndView modelAndView){
        System.out.println("资源访问。。。。");
        modelAndView.addObject("username","interceptor");
        modelAndView.setViewName("success");
        return modelAndView;
    }
}
