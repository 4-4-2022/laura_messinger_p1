package com.lauramessinger.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.lauramessinger.entity.Case;
import com.lauramessinger.service.CaseService;
@RestController
public class CaseController {

	@Autowired
	private CaseService caseService;
	
	@GetMapping(value = "/products/cases")
	public List<Case> getAll() {	
		return caseService.getCases();
	}
	
	@PostMapping(value = "/products/cases/search")
	@ResponseBody
	public List<Case> findCases(@RequestParam Map<String, String> parameters){
		
		Case probe = new Case();
		
		probe.setColor(parameters.get("color"));
		
		probe.setFormType(parameters.get("formType"));
		
		probe.setManufacturer(parameters.get("manufacturer"));
		
		return caseService.getCasesByExample(probe);
	}

	
}
