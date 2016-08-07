package com.hogan.budget.web.handler;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserHandler {

	@RequestMapping("/loginAuthentication")
	public String loginAuthentication(String username, String password) {
		System.out.println(username + "   " + password);
		return "index";
	}
}
