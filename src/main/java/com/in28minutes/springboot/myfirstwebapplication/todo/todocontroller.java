package com.in28minutes.springboot.myfirstwebapplication.todo;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes("name")
public class todocontroller {
	private Todoservice service;
	
	public todocontroller(Todoservice service) {
		super();
		this.service = service;
	}



	@RequestMapping("List-todos")
	public String Listalltodoes(ModelMap model)
	{
 List<Todo> todos=	service.findbyname("Ramachandra");
	model.addAttribute("todos", todos);
		
		return "ListTodos";
	}
	

}
