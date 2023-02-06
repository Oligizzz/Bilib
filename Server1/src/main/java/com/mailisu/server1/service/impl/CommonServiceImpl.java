package com.mailisu.server1.service.impl;

import com.mailisu.server1.async.applicatoinevent.CommonEventObj;
import com.mailisu.server1.service.CommonService;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author: chunzhao
 * @time: 2023/2/3
 */
@Service
public class CommonServiceImpl implements CommonService {


    @Resource
    private ApplicationContext applicationContext;

    @Override
    public void fun1(String param) {
        applicationContext.publishEvent(new CommonEventObj(this, 12L, "message"));
    }

    @Override
    public Integer fib(Integer n) {
        if (n == 0) {
            return 0;
        }

        if (n == 1) {
            return 1;
        }
        return fib(n - 1) + fib(n - 2);
    }


}
