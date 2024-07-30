package com.itccloud.mwccdc.controller;

import org.springframework.stereotype.Controller;
import java.util.*;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
	
	@GetMapping("/")
	public String index(Model model) {
		model.addAttribute("message", "hello zongxi");
		User user = new User("John Doe");
		model.addAttribute("user", user);
		return "index-form";
	}
	
	@GetMapping("/advance")
	public String advance(Model model) {
		List<User> users1 = new ArrayList<User>();
		users1.add(new User("Zongxi Liu"));
		users1.add(new User("John Doe"));
		users1.add(new User("Marry Ken"));
		users1.add(new User("Mark Smith"));
		
		Map<String, User> users2 = new HashMap<String, User>();
		users2.put("Zongxi Liu", new User("Zongxi Liu"));
		users2.put("John Doe", new User("John Doe"));
		
		User[] users3 = new User[] {new User("Zongxi Liu"), new User("John Doe")};
		
		model.addAttribute("users1", users1);
		model.addAttribute("users2", users2);
		model.addAttribute("users3", users3);
		
		return "advance-form";
	}
	
}
