package com.xw.myvalidated.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.xw.myvalidated.data.User;
import com.xw.myvalidated.exception.ExceptionHandler;
import com.xw.myvalidated.exception.NoHandlerFoundException;
import com.xw.myvalidated.service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserServiceImpl userService;

    @PostMapping("/save")
    public JSONObject save(@RequestBody @Validated User user) {
        JSONObject responseBuilder = new JSONObject();
        userService.save(user);
        responseBuilder.put("success", true);
        responseBuilder.put("message", "保存成功");
        return responseBuilder;
    }

    @GetMapping("/find/{id}")
    public JSONObject findPath(@PathVariable("id") String id) {
        JSONObject responseBuilder = new JSONObject();
        try {
            userService.find(id);
        } catch (NoHandlerFoundException e) {
            return new ExceptionHandler().handlerNoFoundException(e);
        }
        responseBuilder.put("success", true);
        responseBuilder.put("message", "查询成功");
        return responseBuilder;
    }
}
