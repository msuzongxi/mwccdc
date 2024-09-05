package com.itccloud.mwccdc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import java.util.*;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.itccloud.mwccdc.mapper.CcdcPoint;
import com.itccloud.mwccdc.mapper.CcdcPointService;
import com.itccloud.mwccdc.mapper.CcdcPointView;
import com.itccloud.mwccdc.mapper.CcdcRepository;
import com.itccloud.mwccdc.mapper.CcdcTask;
import com.itccloud.mwccdc.mapper.CcdcUser;

@Controller
public class HomeController {
	
	@Autowired
	private CcdcRepository repository;
	
	@Autowired
	private CcdcPointService service;

	
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
	
	@GetMapping("/home")
	public String home(Model model) {
		return "home-form";
	}
	
	@GetMapping("/business1")
	public String business1(Model model) {
		return "business1-form";
	}
	

	@GetMapping("/bootstrap-home")
	public String bootstrapHome(Model model) {
		return "bootstrap-home-form";
	}
	
	@GetMapping("/bootstrap-feature1")
	public String bootstrapFeature1(Model model) {
		return "bootstrap-feature1-form";
	}
	
	@GetMapping("/bootstrap-point")
	public String bootstrapPoint(Model model) {
		
//		List<CcdcUser> ccdcUsers = repository.findUsers();
//		List<CcdcTask> ccdcTasks = repository.findTasks();
//		List<CcdcPoint> ccdcPoints = repository.findPoints();
//		
//		model.addAttribute("ccdcusers", ccdcUsers);
//		model.addAttribute("ccdctasks", ccdcTasks);
//		model.addAttribute("ccdcpoints", ccdcPoints);
		
		List<CcdcPointView> ccdcPointViews = service.findPointViews();
		model.addAttribute("ccdcpointviews", ccdcPointViews);
		
		return "bootstrap-point-form";
	}

	
}
