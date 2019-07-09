package com.kgc.controller;

import com.kgc.entity.Users;
import com.kgc.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("/")
public class UsersController {
    @Autowired
    private UsersService usersService;

    @RequestMapping(value = "/{page}")
    public String page(@PathVariable("page") String page){
        return page;
    }
    @RequestMapping(value = "/exists",method = RequestMethod.GET,produces ="application/json;charset=UTF-8" )
    @ResponseBody
     public Map<String,String> exists(String username){
        Map<String,String> map=new HashMap<>();
        //用户名同名
        if (!usersService.exists(username)){
            map.put("msg","Fail");
        }else {//可以注册
            map.put("msg","SUCCESS");
        }
        return map;
     }
     @RequestMapping(value = "/login",method = RequestMethod.POST)
    public String login(String username, String password, HttpSession session){
         Users users = usersService.login(username, password);
         if (null!=users){
             session.setAttribute("users",username);
             return "redirect:index";//登录成功跳转index页面，
         }else{
             return "<script>alert('登录失败，登陆账号或密码错误，请重新输入');history.go(-1);</script>";//失败返回重新登录
         }
     }
    @RequestMapping(value = "/register",method = RequestMethod.POST)
    public String register(Users users,HttpSession session){
        if(usersService.register(users)){
            session.setAttribute("reg_user",users);
            return "success";
        }else{
            return "redirect:login";
        }

    }
}
