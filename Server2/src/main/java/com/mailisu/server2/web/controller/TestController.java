package com.mailisu.server2.web.controller;

import com.mailisu.server2.service.impl.TestServiceImpl;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

/**
 * @author KongXiao
 * @date 2023-02-04 0:40
 */
@RestController
public class TestController {

    @Resource
    private TestServiceImpl testService;

    @GetMapping("/feign/test")
    public String ribbonTest(@RequestParam String message, HttpServletRequest httpServletRequest) {
        return testService.ribbonTest(message);
    }

    @GetMapping("/feign/getFibViaServer1")
    public String getFibViaServer1(@RequestParam Integer num) {
        return testService.getFibViaServer1(num);
    }
}
