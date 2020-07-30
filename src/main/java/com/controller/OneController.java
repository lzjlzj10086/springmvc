package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

/**
 * forward
 * redirect
 * 数据保存，页面跳转
 */
@Controller
@RequestMapping("/demo")
public class OneController {

    @RequestMapping("save")
    public String save(){
        System.out.println("Controller save running.......");
        return "success";

    }
    @RequestMapping("save01")
    public ModelAndView save01(ModelAndView modelAndView){
        modelAndView.addObject("username","springmvc");
        modelAndView.setViewName("success");
        return modelAndView;
    }
    @RequestMapping("save02")
    public String save02(Model model){
        model.addAttribute("username","springmvcModel");
        return "success";
    }
    @RequestMapping("save03")
    public String save03(HttpServletRequest request){
        request.setAttribute("username","springmvcRequest");
        return "success";
    }
}
