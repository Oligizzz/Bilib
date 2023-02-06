package com.mailisu.server1.rest.controller;


import com.mailisu.server1.service.impl.CommonServiceImpl;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

/**
 * @author: chunzhao
 * @time: 2023/2/3
 */
@RestController
public class BaseController {

    @Resource
    private CommonServiceImpl commonService;

    @GetMapping("/test")
    public String test(@RequestParam("message") String message, HttpServletRequest request) {
        commonService.fun1(message);
        return "server1:" + message;
    }

    @GetMapping("/getFib")
    public String getFib(@RequestParam("num") Integer num) {
        return "斐波那契：" + commonService.fib(num);
    }
}
