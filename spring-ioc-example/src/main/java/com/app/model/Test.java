package com.app.model;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Test {

	public static void main(String[] args) {

		// to parse the applicationcontext.xml for configuration purpose
	/*	Resource resource = new ClassPathResource("applicationContext.xml");
		BeanFactory beanFactory = new XmlBeanFactory(resource);
*/
		
		
		ApplicationContext ac=new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Employee employee = (Employee) ac.getBean("employee");
		employee.setId(101);
		employee.setName("abc");

		System.out.println(employee.hashCode());
		
		Employee employee1 = (Employee) ac.getBean("employee1");
		employee1.setId(102);
		employee1.setName("pqr");

		System.out.println(employee1.hashCode());

	
	
	}

}
