package com.app.pojo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DITest {

	public static void main(String[] args) {

		ApplicationContext ac = new ClassPathXmlApplicationContext("di.xml");

		Student student = (Student) ac.getBean("student");
		/*student.setId(101);
		student.setName("abc");

		Address address = (Address) ac.getBean("address");
		address.setCity("Nashik");

		student.setAddr(address);
*/
		System.out.println(student.hashCode());
		System.out.println(student.getAddr().hashCode());

		Student student1 = (Student) ac.getBean("student");
		
		System.out.println(student1.hashCode());
		System.out.println(student1.getAddr().hashCode());
		

		
		
	}

}
