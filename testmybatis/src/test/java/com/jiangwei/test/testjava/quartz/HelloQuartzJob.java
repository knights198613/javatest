package com.jiangwei.test.testjava.quartz;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

import java.util.Date;

/**
 * Created by weijiang
 * Date: 2016/10/26
 * Desc: 调度任务的实现类
 */
public class HelloQuartzJob implements Job {

    @Override
    public void execute(JobExecutionContext jobExecutionContext) throws JobExecutionException {
        System.out.println("Hello Quartz, this job execute at "+ new Date()+" by trigger context name: "+
                jobExecutionContext.getTrigger().getName());
    }
}
