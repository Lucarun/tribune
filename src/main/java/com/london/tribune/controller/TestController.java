package com.london.tribune.controller;


import com.london.tribune.model.User;
import com.london.tribune.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RequestMapping("/test/")
@RestController
public class TestController {

    @Autowired
    UserService userService;

    @GetMapping("return")
    public String getAuthCode(@RequestParam(value = "name") String name){
        return "name is : " + name;
    }

    @GetMapping("user/{id}")
    public User getAuthCode(@PathVariable("id") Integer id){
        return userService.selectByPrimaryKey(id);
    }
}
