package com.pass.basic.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.pass.basic.model.Login;

@Controller
@RequestMapping("/main")
public class LoginController {

	
	/*@RequestMapping(value = "/add", method = RequestMethod.GET)
	public ModelAndView hiWorld(){
        ModelAndView model = new ModelAndView("login");
        String message = "Hello World, Spring 3.0!";
        System.out.println(message);
        //model.addObject("welcomeMessage","Hello World");
        return model;   
    }*/
	
	@RequestMapping(value = "/add", method = RequestMethod.GET)
	public String hiWorld(){
       
        String message = "Hello World, Spring 3.0!";
       
		
		return "login";
    }
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String loginme(@ModelAttribute Login login ){
      /*  ModelAndView model = new ModelAndView("success");
        String message = "inside success";
        System.out.println(message);
        //model.addObject("welcomeMessage","Hello World");
        return model;   */
		
		Login obj=new Login();
		obj.setUsername(login.getUsername());
		obj.setPassword(login.getPassword());
		return "success";
    }
}
