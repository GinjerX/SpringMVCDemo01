package com.ps.controller;

import com.ps.vo.User;
import org.springframework.web.bind.annotation.*;

@RestController
public class HelloControllerDemo {

    @RequestMapping("/hello")
    @ResponseBody
    public String hello(){
        System.out.println("whhhh");
        return "dfsdfdssfd";
    }
    /*@RequestMapping(path = "/hello2",method = RequestMethod.GET)
    public String index(){
        System.out.println("zehishi yigei sdfhasdif");

        return "/hello.html";
    }*/
   /* @GetMapping("/hello2")
    public String index(){
        System.out.println("zehishi yigei sdfhasdif");

        return "/hello.html";
    }*/
   /*
    @RequestMapping("/hello2/{id}/{name}")
    public String index(@PathVariable int id,@PathVariable String name){
        System.out.println("id :"+id);
        System.out.println("name:"+name);
        System.out.println("zehishi yigei sdfhasdif");

        return "/hello.html";
    }*/
   //@RequestParam(name="admin",required = false,defaultValue = "默认值")
   /* @RequestMapping("/hello2")
    public String index(@RequestParam int id){
        System.out.println("id :"+id);
        return "/hello.html";
    }*/
    /*@RequestMapping("/hello2")
    public String index(User user){
        System.out.println("id :"+user.getId());
        System.out.println("name:"+user.getName());
        System.out.println("zehishi yigei sdfhasdif");

        return "/hello.html";
    }*/
    @RequestMapping("/hello2")
    @ResponseBody
    public User index(User user){
        user.setId(1);
        user.setUsername("admin");
        user.setPassword("123456");
        System.out.println(user);
        System.out.println("这是一个sss");
        return user;
    }



}
