package com.test;

import org.quartz.JobBuilder;
import org.quartz.JobDetail;
import org.quartz.JobKey;
import org.quartz.Scheduler;
import org.quartz.impl.StdSchedulerFactory;

public class IntiateTrigger
{
	public static void main(String[] args) throws Exception {


		/*JobDetail job = JobBuilder.newJob(MyClass.class)
			.withIdentity("dummyJobName", "group1").build();

         
		// schedule it
		Scheduler scheduler = new StdSchedulerFactory().getScheduler();
		scheduler.start();
		scheduler.scheduleJob(job, trigger);*/
		
		Scheduler scheduler = new StdSchedulerFactory().getScheduler();
		
		JobKey jobKey = JobKey.jobKey("myNewJob", "myJobGroup");
		JobDetail job = JobBuilder.newJob(MyClass.class).withIdentity(jobKey).storeDurably().build();

		//Register this job to the scheduler
		scheduler.addJob(job, true);
		scheduler.start();
		//Immediately fire the Job MyJob.class
		scheduler.triggerJob(jobKey);
	}
}