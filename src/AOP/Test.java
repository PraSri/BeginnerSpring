package AOP;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String args[]) {
		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext1.xml");
		Operation e = (Operation) context.getBean("opBean");
//		System.out.println("Calling msg>>>!!!!");
//		e.msg();
		System.out.println("Calling m >> !!!");
		System.out.println(e.m());
		System.out.println("Calling k >>!!");
		System.out.println(e.k());
	}
}
