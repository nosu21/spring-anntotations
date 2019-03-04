package co.tomcio.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {
	@Autowired
	@Qualifier("randomFortuneService")
	private FortuneService fortuneService;
	
	public TennisCoach() {
		System.out.println(">>TennisCoach: inside default constructor");
	}
	
	
//	//define method
//	@Autowired
//	public void doSomeCrazyStuff(FortuneService fortuneService) {
//		System.out.println(">>TennisCoach: inside doSomeCrazyStuff() method");
//		this.fortuneService = fortuneService;
//	}
	
//	@Autowired
//	public TennisCoach(FortuneService fortuneService, TemporaryService temporaryService) {
//		this.fortuneService = fortuneService;
//		this.temporaryService = temporaryService;
//	}

	public String getDailyWorkout() {
		return "Practice you backhand volley";
	}

	public String getDailyFortune() {
		return fortuneService.getFortune();
	}



	

}
