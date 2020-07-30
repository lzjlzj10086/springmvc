package com.interceptor;

import com.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("user")
public class loginController {

    @RequestMapping("login")
    public String login(User user, HttpSession session){
        if("zhangsan".equals(user.getName())&&"123456".equals(user.getPassWord())){
            session.setAttribute("user",user);
            return "list";
        }else {
            return "redirect:/login.jsp";
        }
    }
}
