package com.kru.springmvc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class LoginController {
	
	@Autowired
	LoginService loginService;

	@RequestMapping(value="/login",method=RequestMethod.GET)
	public String showLoginRequest() {
		return "login";
	}
	
	@RequestMapping(value="/login",method=RequestMethod.POST)
	public String handleLoginRequest(@RequestParam String name, @RequestParam String password, ModelMap model) {
		
		if(loginService.isUseValid(name, password)) {
			model.put("name", name);
			model.put("password", password);
			return "welcome";
		} else {
			model.put("errorMsg", "Invalid credentials");
			return "login";
		}
		
	}
}
