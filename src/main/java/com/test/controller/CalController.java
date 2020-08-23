package com.test.controller;

import com.test.service.UserService;
import com.test.util.Util;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

@RestController
public class CalController {

    @Resource
    private UserService userService;

    @GetMapping("/testName")
    public Object test(@RequestParam String name) {
        return userService.testName(name);
    }

}
