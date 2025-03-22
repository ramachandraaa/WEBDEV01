package com.in28minutes.springboot.myfirstwebapplication.login;

import org.springframework.stereotype.Service;

@Service
public class AuthenticationService {
	
	public boolean authenticate(String UserId,String Userpassword)
	{
		boolean isvalidusername=UserId.equalsIgnoreCase("Ram");
		boolean isvaliduserpass=Userpassword.equalsIgnoreCase("Ram");
		
		
		return isvalidusername&&isvaliduserpass;//
	}

}
