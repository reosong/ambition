package test;

import org.springframework.context.support.*;

public class MainClass {

	public static void main(String[] args) {
		
		//Trans trans = new Trans();
		//trans.move();
		
		
		
		//컨테이너 생성 완료 
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("classpath:first.xml");
		
		
		Trans trans = ctx.getBean("money",Trans.class);
		
		trans.move();
		
		ctx.close();
		
		
		
	}

}
