package com.debuggeandoideas.cronapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

@SpringBootApplication
@EnableScheduling
public class CronappApplication {

	Long times = 0L;

	public static void main(String[] args) {
		SpringApplication.run(CronappApplication.class, args);
	}

	@Scheduled(fixedRate = 2000)
	public void schedule() {
		System.out.println("Execute task task every 2 seconds " + times++);
	}


}
