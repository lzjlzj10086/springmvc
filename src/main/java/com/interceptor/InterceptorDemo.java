package com.interceptor;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 拦截器只进行Controller的方法拦截
 * 拦截器步骤：
 *      1.实现HandlerInterceptor，重写里面方法
 *      2.配置我们创建的拦截类（配置拦截器
 *      3.目标方法的编写
 */
public class InterceptorDemo implements HandlerInterceptor {
    //目标方法执行之前，执行,返回false则不放行，true则可以访问目标资源
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        System.out.println("preHaddle......");
        return true;
    }
    //目标方法执行之后，视图对象返回之前执行
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        System.out.println("postHandle......");
    }
    //整个目标方法流程执行完毕后，执行
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        System.out.println("afterCompletion......");
    }
}
