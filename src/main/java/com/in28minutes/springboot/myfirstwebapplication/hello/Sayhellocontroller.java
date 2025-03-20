package com.in28minutes.springboot.myfirstwebapplication.hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

//@Controller
public class Sayhellocontroller {
    @RequestMapping("Say-Hello-JSP")
    //@ResponseBody
    public String sayhellojsp()
    {
        return "Sayhello";
    }

}
