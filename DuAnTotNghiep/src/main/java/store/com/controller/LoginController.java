package store.com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SecurityController {

	@RequestMapping("register")
	public String register() {
		return "security/register";
	}
	
	@RequestMapping("login")
	public String login() {
		return "security/login";
	}
	
	public String asd(){
		return "asd";
	}
}
