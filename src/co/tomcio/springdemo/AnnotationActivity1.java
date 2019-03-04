package co.tomcio.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationActivity1 {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context =
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Coach theCoach = context.getBean("hockeyCoach", Coach.class);
		
		System.out.println(theCoach.getDailyWorkout());
		
		context.close();

	}

}
