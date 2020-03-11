package com.gedu.timer;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class TimerTestTsak {

    @Scheduled(cron = "0/5 * * * * *")
    public void  testTime(){
        System.out.println("定时任务执行了");

    }
}
