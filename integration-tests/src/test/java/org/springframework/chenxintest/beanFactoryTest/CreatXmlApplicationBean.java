package org.springframework.chenxintest.beanFactoryTest;

import beanFactoryTest.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CreatXmlApplicationBean {
	public static void main(String[] args) {
		//使用spring容器
		ApplicationContext context = new ClassPathXmlApplicationContext("org/springframwork/chenxintest/applicationContext.xml");
		Person person = (Person)context.getBean("person");
		System.out.println(person);
	}
}
