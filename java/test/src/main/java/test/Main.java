package test;

import org.springframework.context.support.*;

public class Main {

	public static void main(String[] args) {
		

		GenericXmlApplicationContext ctx =
				new GenericXmlApplicationContext("classpath:app.xml");
		
		Bettery bettey =
				ctx.getBean("bettery",Bettey.class);
		
		
		
		
	}  

}
