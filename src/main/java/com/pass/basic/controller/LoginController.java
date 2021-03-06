package com.pass.basic.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.pass.basic.model.Login;
import com.pass.basic.model.Register;

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
	
	
	@RequestMapping(value = "/register", method = RequestMethod.POST)
	public ModelAndView loginme(@ModelAttribute Register register){	
		Register r=new Register();
		r.setUsername(register.getUsername());
		r.setEmail(register.getEmail());
		r.setPassword(register.getPassword());
		r.setConfirmpassword(register.getConfirmpassword());
		ModelAndView m1=new ModelAndView("success");
		return m1;
    }
}
