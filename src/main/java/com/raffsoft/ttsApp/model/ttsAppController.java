package com.raffsoft.ttsApp.model;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ttsAppController {
	
	@Autowired
	ttsAppService ttsappservice;
	
	@RequestMapping("/")
	public String landing() {
		return " WELCOME TO RAFFSOFT SYSTEMS TEST TRACKER ";
	}

	@RequestMapping(method=RequestMethod.POST ,value="/save")
	public void senddata(@RequestBody ttsApp ttsapp) {
		ttsappservice.senddata(ttsapp);
	}
	
	
	@RequestMapping("/read")
	public  List<ttsApp> getAllData() {
	return	ttsappservice.getAllData();
	}
	/*
	@GetMapping("/read/{status}")
	public ttsApp getDatabyStatus(@PathVariable String status) {
		return ttsappservice.getttsAppByStatus(status);
	}
	
	@GetMapping("/read/{project}")
	public ttsApp getDatabyProject(@PathVariable String project) {
		return ttsappservice.getttsAppbyProject(project);
		
	}*/
	
	
	
	
	
}
