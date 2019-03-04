package co.tomcio.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {

	public static void main(String[] args) {

		// read spring config file
		ClassPathXmlApplicationContext context =
				new ClassPathXmlApplicationContext("applicationContext.xml");
			
		// get the bean from spring container
		Coach theCoach = (Coach) context.getBean("tennisCoach", Coach.class);
	
		//call a method on the bean
		System.out.println(theCoach.getDailyWorkout());
		
		// call method to get daily fortune
		System.out.println(theCoach.getDailyFortune());		
		System.out.println(theCoach.getTemp());

		//close context
		context.close();
	}

}
