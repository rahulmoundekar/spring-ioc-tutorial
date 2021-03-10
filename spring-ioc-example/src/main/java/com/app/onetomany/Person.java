package com.app.onetomany;

import java.util.List;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Person implements InitializingBean, DisposableBean{

	private int id;
	private String name;

	private List<Certificates> certificates;

	public List<Certificates> getCertificates() {
		return certificates;
	}

	public void setCertificates(List<Certificates> certificates) {
		this.certificates = certificates;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", certificates=" + certificates + "]";
	}

	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("destory initialized Object");
		
	}

	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("setup for dynamic object creation");
		
	}
	
	
	/*public void setup() {
		System.out.println("setup for dynamic object creation");
	}
	
	public void cleanUp() {
		System.out.println("destory initialized Object");
	}*/
	
	
	
	
	
	
}
