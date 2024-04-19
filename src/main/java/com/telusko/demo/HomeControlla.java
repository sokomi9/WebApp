package com.telusko.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeControlla {
	@RequestMapping("home")
	//@ResponseBody
	public String home() {
		return "home.jsp";
	}
 
}
