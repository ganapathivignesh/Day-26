package com.src;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Mycontroller {
	
	@Autowired
	EmployeeDao edao;
	
	@RequestMapping("/")
	public String register()
	{
		return "index";
	}
	
	@RequestMapping("/register")
	public String registering(@RequestParam("eid")String eid,@RequestParam("ename")String ename,@RequestParam("eaddres")String eaddres,Model m)
	{
		Employee e=new Employee();
		e.setEid(Integer.parseInt("eid"));
		e.setEname("ename");
		e.setEaddres("eaddres");
		
		edao.SaveEmployee(e);
		List<Employee> l=edao.getallEmployee();
		m.addAttribute("li", l);
		
		return "display";
	}

	@RequestMapping("/delete")
	public String deleteemployee(@RequestParam("eid")String eid,@RequestParam("ename")String ename,@RequestParam("eaddres")String eaddres,Model m)
	{
		Employee e=new Employee();
		e.setEid(Integer.parseInt(eid));
		edao.deleteEmployee(e);
		List<Employee> l=edao.getallEmployee();
		m.addAttribute("li", l);
		
		return "display";
		
	}
	}
	

