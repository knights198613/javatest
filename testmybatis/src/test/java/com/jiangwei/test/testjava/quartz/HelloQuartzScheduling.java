package com.jiangwei.test.testjava.quartz;

import org.quartz.*;
import org.quartz.impl.StdSchedulerFactory;

import java.util.Date;

/**
 * Created by weijiang
 * Date: 2016/10/26
 * Desc: quartz 测试类
 */
public class HelloQuartzScheduling {
    public static void main(String[] args) {
        SchedulerFactory schedulerFactory = new StdSchedulerFactory();
        try {
            Scheduler scheduler = schedulerFactory.getScheduler();
            JobDetail jobDetail = new JobDetail("HelloQuartz", Scheduler.DEFAULT_GROUP, HelloQuartzJob.class);
            SimpleTrigger simpleTrigger = new SimpleTrigger("simpleTrigger", Scheduler.DEFAULT_GROUP);
            simpleTrigger.setStartTime(new Date());
            simpleTrigger.setRepeatInterval(5000);
            simpleTrigger.setRepeatCount(5);
            scheduler.scheduleJob(jobDetail, simpleTrigger);
            scheduler.start();
        } catch (SchedulerException e) {
            e.printStackTrace();
        }
    }
}
