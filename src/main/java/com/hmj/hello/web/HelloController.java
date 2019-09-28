package com.hmj.hello.web;


import com.hmj.hello.mapper.UserMapper;
import com.hmj.hello.model.User;

import com.hmj.hello.service.RedisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.List;

@RestController
public class HelloController{

    @Autowired
    private UserMapper userMapper;
    @Autowired
    private RedisService redisService;

    //可以通过路径名称来访问并获取
    //如localhost:8080/hello/hmj
    @RequestMapping(value = "/hello/{name}", method = RequestMethod.GET)
    public String hello(@PathVariable String name) {
        return "hello world34444" + name;
    }

    @RequestMapping("/saveUser")
    public void saveUser(@Valid User user, BindingResult result) {
        if (result.hasErrors()) {
            List<ObjectError> list = result.getAllErrors();
            for (ObjectError error : list) {
                System.out.println(error.getCode() + "-" + error.getDefaultMessage());
                System.out.println();
            }
        }
    }

    @RequestMapping("/deleteUser")
    public  void  deleteUser(Long id){
        userMapper.delete(id);
    }

    @RequestMapping("/testRedis")
    public  void  testRedis(String key){
        redisService.set(key,"123");

        System.out.println(redisService.get(key));

    }
}
