package com.companies.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.companies.entity.Employee;
import com.companies.repository.EmployeeRepository;

@Controller
public class HelloWorldController {
	
	@Autowired
	EmployeeRepository employeeRepo;

	@RequestMapping(value = "/hello",  method = RequestMethod.GET)
    public String doGet(Model model) {
        
		Employee employee = new Employee();
		model.addAttribute("empForm", employee);
		
        String str = "Microservices";
        model.addAttribute("message", str);
        
        str = "Quality";
        model.addAttribute("qualityHeader", str);
        
        str = "We are the best programmers in the world, hands down!";
        model.addAttribute("qualityMessage", str);
        
        str = "Our Plea";
        model.addAttribute("pleaHeader", str);
        
        str = "Please donate £6000 to set another poor, inflicted programmer free from the bondage of a restrictive contract with a top IT training company in the UK today";
        model.addAttribute("pleaMessage", str);
        
        str = "Contact Us";
        model.addAttribute("contactHeader", str);
        
        str = "Feel free to contact us at any time - We are available 24/7, 365 days a year :)";
        model.addAttribute("contactMessage", str); 
        
        str = "Profile";
        model.addAttribute("profileHeader", str);
        
        str = "We are Computer Science graduates with a passion for programming and software development in Java and C#, specializing in Spring . With vast amounts of experience in languages such as CSS, JavaScript and HTML. "
        		+ "We have the ability to build sharp, scalable and user friendly web applications using the Java EE platform.";
        model.addAttribute("profileMessage", str);
        
        ArrayList<Employee> employees = new ArrayList<Employee>();
        for (Employee emp: employeeRepo.findAll() )
        {
        	employees.add(emp);
        }
        
		model.addAttribute("employees", employees);

        return "hello";
    }
	
	@RequestMapping(value = "/hello", method = RequestMethod.POST)
    public String doPost(@ModelAttribute("empForm") Employee employee,  @RequestParam String firstName, 
    		@RequestParam String lastName,  @RequestParam int salary, BindingResult result, Model model)
    {

        String str = "Microservices";
        model.addAttribute("message", str);
        
        str = "Quality";
        model.addAttribute("qualityHeader", str);
        
        str = "We are the best programmers in the world, hands down!";
        model.addAttribute("qualityMessage", str);
        
        str = "Our Plea";
        model.addAttribute("pleaHeader", str);
        
        str = "Please donate £6000 to set another poor, inflicted programmer free from the bondage of a restrictive contract with a top IT training company in the UK today";
        model.addAttribute("pleaMessage", str);
        
        str = "Contact Us";
        model.addAttribute("contactHeader", str);
        
        str = "Feel free to contact us at any time - We are available 24/7, 365 days a year :)";
        model.addAttribute("contactMessage", str); 
        
        str = "Profile";
        model.addAttribute("profileHeader", str);
        
        str = "We are Computer Science graduates with a passion for programming and software development in Java and C#, specializing in Spring . With vast amounts of experience in languages such as CSS, JavaScript and HTML. "
        		+ "We have the ability to build sharp, scalable and user friendly web applications using the Java EE platform.";
        model.addAttribute("profileMessage", str);
        
        Employee temp = new Employee();
        
        temp.setID();
        temp.setFirstName(firstName);
        temp.setLastName(lastName);
        temp.setSalary(salary);
        
        employeeRepo.save(temp);
        
        str = firstName + " has been added to the system";
        model.addAttribute("confirmation", str);
        
        ArrayList<Employee> employees = new ArrayList<Employee>();
        for (Employee emp: employeeRepo.findAll() )
        {
        	employees.add(emp);
        }
        
		model.addAttribute("employees", employees);
		return "hello";
    }

}