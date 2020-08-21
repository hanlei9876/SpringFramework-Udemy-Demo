package com.bswr.springdemo;

public class CricketCoach implements Coach {

	private FortuneService fortuneService;
	
	
	private String emailAddress;
	private String team;
	
	
	// getter for emailAdress
	public String getEmailAddress() {
		System.out.println("CricketCoach: inside getter method - getEmailAddress");
		return emailAddress;
	}
	
	// setter for emailAdress
	public void setEmailAddress(String emailAddress) {
		System.out.println("CricketCoach: inside setter method - setEmailAddress");
		this.emailAddress = emailAddress;
	}
	
	// getter for team
	public String getTeam() {
		System.out.println("CricketCoach: inside getter method - getTeam");
		return team;
	}
	
	// setter for team
	public void setTeam(String team) {
		System.out.println("CricketCoach: inside setter method - setTeam");
		this.team = team;
	}

	
	// create a no-arg constructor
	public CricketCoach() {
		System.out.println("CricketCoach: inside no-arg constructor");
	}
	
	// our setter method
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("CricketCoach: inside setter method - setFortuneService");
		this.fortuneService = fortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		return "Practice fast bowling for 15 mins.";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
