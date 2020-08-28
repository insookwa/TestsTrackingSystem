package com.raffsoft.ttsApp.model;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ttsAppService {
	
	@Autowired
	ttsAppRepository ttsapprepo;
	
	//write to the database and send email of whatever goes into the database 
	
	public ttsApp senddata(ttsApp ttsapp) {
		
		return ttsapprepo.save(ttsapp);
		
	}
	
	//read all data from database
	
	public List<ttsApp> getAllData(){
		
		return ttsapprepo.findAll();
		
//		List<ttsApp>tests = new ArrayList<>();
//		ttsapprepo.findAll().forEach(tests::add);
//		return tests;
	}
	
	
/*	//read from the database by Status
	public ttsApp getttsAppByStatus(String status) {
		return ttsapprepo.findAllByStatus(status);
	}
	
	//read from the database by Project
public ttsApp getttsAppbyProject(String project) {
	return ttsapprepo.findAllByProject(project);
}*/


	
	
	

}
