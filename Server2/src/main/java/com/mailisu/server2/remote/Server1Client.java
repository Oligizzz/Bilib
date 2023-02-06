package com.mailisu.server2.remote;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author KongXiao
 * @date 2023-02-04 1:05
 */
@FeignClient(value = "SERVER1", fallback = Server1Client.Server1ClientFallback.class)
public interface Server1Client {


    @GetMapping("/test")
    String hello(@RequestParam("message") String message);

    @GetMapping("/getFib")
    String getFib(@RequestParam("num") Integer num);

    @Component
    class Server1ClientFallback implements Server1Client {
        @Override
        public String hello(String message) {
            return null;
        }

        @Override
        public String getFib(Integer num) {
            return "server1.getFib exception ! param=" + num;
        }
    }


}
