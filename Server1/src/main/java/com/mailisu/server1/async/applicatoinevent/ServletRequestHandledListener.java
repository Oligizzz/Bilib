package com.mailisu.server1.async.applicatoinevent;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;
import org.springframework.web.context.support.ServletRequestHandledEvent;

/**
 * @author: chunzhao
 * @time: 2023/2/3
 */
@Component
public class ServletRequestHandledListener implements ApplicationListener<ServletRequestHandledEvent> {
    @Override
    public void onApplicationEvent(ServletRequestHandledEvent event) {
//        System.out.println(event.getSource().toString());
//        try {
//            TimeUnit.SECONDS.sleep(5);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        System.out.println("处理请求" + event);
    }
}
