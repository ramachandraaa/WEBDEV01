package com.in28minutes.springboot.myfirstwebapplication.login;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes("name")
public class Logincontroller {
	private AuthenticationService auth;
	public Logincontroller(AuthenticationService auth) {
		super();
		this.auth = auth;
	}
	/*@RequestMapping("login")
	public String loginpage(@RequestParam String name,ModelMap model)
	{
		model.put("cls", name);//cls is used in mapping with the jsp
		System.out.println("Request param is:"+name);//Not recommended
		return "Loginpage";
	}
*/
	@RequestMapping(value="login",method=RequestMethod.GET)
	
	public String loginpage()
	{
		return "Loginpage";
	}
	@RequestMapping(value="login",method=RequestMethod.POST)
	public String welcomepage(@RequestParam String name,
			@RequestParam String password,ModelMap model)
	{
		if(auth.authenticate(name, password))
		{
		
		model.put("name", name);
		//model.put("password", password);
		return "welcome";
		}
		model.put("Errormessege", "invalid Credentials");
		return "Loginpage";
		
	}
}