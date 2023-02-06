package com.mailisu.server2.service.impl;

import com.mailisu.server2.remote.Server1Client;
import com.mailisu.server2.service.TestService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author KongXiao
 * @date 2023-02-04 0:41
 */
@Service
public class TestServiceImpl implements TestService {


    @Resource
    private Server1Client server1Client;

    @Override
    public String ribbonTest(String message) {
        return server1Client.hello(message);
    }

    @Override
    public String getFibViaServer1(Integer num) {
        return server1Client.getFib(num);
    }

}
