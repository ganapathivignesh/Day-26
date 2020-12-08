package com.src;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mainclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		ApplicationContext con=new ClassPathXmlApplicationContext("applicationcontext.xml");
		
		Employee e=(Employee)con.getBean("emp");
		EmpDao ed=(EmpDao) con.getBean("empdao");
		int i=ed.SaveEmp(e);
		if(i>0)
		{
			System.out.println("inserted succesfully");
			
		}
		else
		{
			System.out.println("values not inserted");
		}
		ed.updateEmp(e);
		
		
		
	}

}
