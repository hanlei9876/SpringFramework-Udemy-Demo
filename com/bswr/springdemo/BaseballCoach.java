package com.bswr.springdemo;

public class BaseballCoach implements Coach {
	
	// define a private field for dependency object
	private FortuneService fortuneService;
	
	// define constructor for dependency injection
	public BaseballCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}
	
	
	
	@Override
	public String getDailyWorkout() {
		return "spend 30 miniutes on batting pratice.";
	}

	@Override
	public String getDailyFortune() {
		
		// use my fortune service to get fortune
		return fortuneService.getFortune();
	}
}
