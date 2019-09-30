package com.mastan.mains;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mastan.beans.Address;
import com.mastan.beans.Employee;
import com.mastan.beans.Student;
import com.mastan.beans.User;

public class MainEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	ApplicationContext context=new ClassPathXmlApplicationContext("mybeans.xml");
	
Student student=(Student)		context.getBean("student");
System.out.println(student.getId()+","+student.getName()+","+student.getDetails().getTotal_marks());
	
	
		/*
		 * Address emp=(Address)context.getBean("addr");
		 * System.out.println(emp.getLine1()+","+emp.getLine2());
		 */
	
		/*
		 * User user=(User) context.getBean("user");
		 * System.out.println(user.getId()+","+user.getName());
		 */	}

}
