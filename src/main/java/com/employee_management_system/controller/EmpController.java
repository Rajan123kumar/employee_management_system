package com.employee_management_system.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.employee_management_system.entity.Employee;
import com.employee_management_system.service.EmpService;

@Controller
public class EmpController {
	@Autowired
    private EmpService empservice;
	
	@GetMapping("/")
	public String home(Model e)
	{
		List<Employee> emp=empservice.getAll();
		e.addAttribute("emp", emp);
		return "index";
		
	}
	@GetMapping("/addemp")
	public String addEmpForm() {
		return "add_emp";
		
	}
	@PostMapping("/register")
	public String empRegister(@ModelAttribute Employee e,HttpSession session) {
		
		System.out.println(e);
		empservice.addEmp(e);
		session.setAttribute("msg", "Employee Added Sucessfully....");
		return "redirect:/";
		
	}
	@GetMapping("/edit/{id}")
	public String edit(@PathVariable int id,Model m) {
		Employee emp=empservice.getEmpById(id);
		m.addAttribute("emp",emp);
		return "edit";
		
	}

}
