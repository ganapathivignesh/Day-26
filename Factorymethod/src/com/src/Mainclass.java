package com.src;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class Mainclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext con=new ClassPathXmlApplicationContext("applicationcontext.xml");
		
		Circle fc=(Circle) con.getBean("cir");
		fc.run();
		
		Rectangle fc1=(Rectangle) con.getBean("rect");
		fc1.run();
		
		 Triangle fc2=(Triangle) con.getBean("tri");
		fc2.run();
		
	}

}
