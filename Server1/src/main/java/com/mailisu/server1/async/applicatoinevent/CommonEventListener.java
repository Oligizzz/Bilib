package com.mailisu.server1.async.applicatoinevent;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * @author: chunzhao
 * @time: 2023/2/3
 */
@Component
public class CommonEventListener implements ApplicationListener<CommonEventObj> {
    @Override
    public void onApplicationEvent(CommonEventObj event) {
        System.out.println("通用事件处理：" + event);
    }
}
