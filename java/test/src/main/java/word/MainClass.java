package word;

import org.springframework.context.support.*;

public class MainClass {
	public static void main(String[] args) {
		
		
		String[] keyWords = {"1","2","3"};
		String[] values = {"123","222","333"};
		
		
		GenericXmlApplicationContext ctx =
				new GenericXmlApplicationContext("classpath:appCtx.xml");
		
		
		WordRegisterService regiserService =
				ctx.getBean("registerService",WordRegisetService.class);
		
		
		
		
		
		
		
	}

}
