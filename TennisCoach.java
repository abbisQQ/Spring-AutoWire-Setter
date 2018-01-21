package com.luv2code.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//bean id someSillyCoach
@Component("someSillyCoach")
public class TennisCoach implements Coach {

	
	private FortuneService FortuneService;
	
	public TennisCoach() {
		System.out.println("Inside tennis coach instructor");
	}
	


	//You can @Autowired any method not only setters
	@Autowired
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("inside setter method");
		FortuneService = fortuneService;
	}




	@Override
	public String getDailyWorkOut() {
		// TODO Auto-generated method stub
		return "Back hand volley";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return FortuneService.getFortune();
	}

}
