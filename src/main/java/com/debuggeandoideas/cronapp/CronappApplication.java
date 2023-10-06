package com.debuggeandoideas.cronapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

@SpringBootApplication
@EnableScheduling
public class CronappApplication {


	public static void main(String[] args) {
		SpringApplication.run(CronappApplication.class, args);
	}

	@Scheduled(fixedRate = 2000)
	public void schedule() {
		MyHelper.times();
	}


}
