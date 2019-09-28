package com.hmj.hello.job;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * @author shkstart
 * @create 2019-09-11-16:01
 */
@Component
public class SchedulerTask {

    private int count=0;

    @Scheduled(cron="*/6 * * * * ?")
//    @Scheduled(fixedRate = 6000)
    private void process(){
        System.out.println("this is scheduler task runing  "+(count++));
    }

}
