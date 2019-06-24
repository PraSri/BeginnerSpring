package firstspring;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Test {

	public static void main(String args[]) {
		Resource resource = new ClassPathResource("applicationContext.xml");
		BeanFactory factory = new XmlBeanFactory(resource);
		Student student = (Student) factory.getBean("studentbean");
		student.displayInfo();
		Employee emp = (Employee) factory.getBean("employeebean");
		emp.displayInfo();
		Question q = (Question) factory.getBean("q");
		q.displayInfo();
		System.out.println("NON STRING DEPENDENT CONSTRUCTOR_____________");
		Question q1 = (Question) factory.getBean("q1");
		q1.info();
		System.out.println("MAP CONSTRUCTOR___________");
		Question q2 = (Question) factory.getBean("mapAnswers");
		q2.displayMapInfo();
		System.out.println("MAP CONSTRUCTOR WITH USER DEFINED ANSWER AND USER____________");
		Question q3 = (Question) factory.getBean("mapUser");
		q3.displayUserMapInfo();
		System.out.println("PARENT ATTRIBUTE IN BEAN ______________________");
		Employee emp1 = (Employee) factory.getBean("echild");
		emp1.displayInfo();
		System.out.println("SETTER INJECTION ___________________");
		Employee emp2 = (Employee) factory.getBean("obj");
		emp2.displayInfoCity();
		System.out.println("SI Dependent object__________________");
		Employee emp3 = (Employee) factory.getBean("obj112");
		emp3.displayInfo();
		System.out.println("SI LIST ___________");
		Question siq = (Question) factory.getBean("SIList");
		siq.displayInfo();
		System.out.println("SI LIST GENERIC____________________________________________");
		Question siansList = (Question) factory.getBean("SIListAns");
		siansList.info();
		System.out.println("SI MAP _______________");
		Question simap1 = (Question) factory.getBean("SIMAP1");
		simap1.displayMapInfo();
		System.out.println("SI MAP GENERIC_____________________________");
		Question simap2 = (Question) factory.getBean("SIMAP2");
		simap2.displayUserMapInfo();
		
		//Autowiring
		
		System.out.println("AUTOWIRING____________________________");
		ApplicationContext context  =new ClassPathXmlApplicationContext("applicationContext.xml");
		A a = context.getBean("a",A.class);
		a.display();
		System.out.println("Inject dependency by static factory method>>>>>>>>>>>>>>>>>___________");
		factoryA fa = (factoryA) context.getBean("fa");
		fa.msg();
		
	}

}
