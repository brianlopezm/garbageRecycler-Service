package com.brian.gargageRecycler;

import java.util.Date;
import java.util.TimeZone;

import javax.annotation.PostConstruct;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GargageRecyclerApplication {
	
	@PostConstruct
    public void init(){
		TimeZone.setDefault(TimeZone.getTimeZone("America/Buenos_Aires"));
        System.out.println("Spring boot application running in UTC timezone :"+new Date());   // It will print UTC timezone
    }
	public static void main(String[] args) {
		SpringApplication.run(GargageRecyclerApplication.class, args);
	}
}
