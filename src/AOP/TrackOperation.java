package AOP;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;  

@Aspect
public class TrackOperation {
	
//	@Pointcut("execution(* Operation.*(..))")
//	
//	public void k() {
//		
//	}
//	
//	@Before("k()")
//	public void myadvice(JoinPoint jp) {
//		System.out.println(" Inside Before Annotation");
//	}
//	
//	@After("k()")
//	public void myadviceAfter(JoinPoint jp) {
//		System.out.println("Inside After Annotation");
//	}
	
	@AfterReturning(
			pointcut  = "execution(* Operation.*(..))",
			returning = "result"
			)
	public void myAdviceAfterReturning(JoinPoint jp , Object result) {
		System.out.println("Inside AFTER_RETURNING_ANNOTATION");
		System.out.println("Method Signature: " + jp.getSignature());
		System.out.println("Result in advice : " + result);
		System.out.println("End of after returning advice.........");
	}
	

}
