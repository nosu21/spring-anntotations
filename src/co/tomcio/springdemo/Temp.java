package co.tomcio.springdemo;

import org.springframework.stereotype.Component;

@Component
public class Temp implements TemporaryService {

	public String getTemp() {
		return "Hello from temp";
	}

}
