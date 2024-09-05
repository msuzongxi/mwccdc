package com.itccloud.mwccdc.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.core.type.TypeReference;
import com.itccloud.mwccdc.mapper.CcdcPoint;
import com.itccloud.mwccdc.mapper.CcdcPointService;

@RestController
public class AjaxController {
	
	@Autowired
	CcdcPointService service;
	
	@PostMapping("/api/savepoints")
	public String handlePointUpdateRequest(@RequestBody String requestBody) {
		
		ObjectMapper mapper = new ObjectMapper();
		boolean ret = true;
		try {
			List<CcdcPoint> points = mapper.readValue(requestBody, new TypeReference<List<CcdcPoint>>(){});
			service.savePoints(points);
		} catch (Exception e) {
			ret = false;
			e.printStackTrace();
		}
		
		if(ret) {
			return "{\"code\":\"success\"}";  
		}else {
			return "{\"code\":\"fail\"}";
		}
	}

}
