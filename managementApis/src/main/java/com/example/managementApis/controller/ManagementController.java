package com.example.managementApis.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.managementApis.entity.Management;
import com.example.managementApis.service.ManagementService;

@RestController
@RequestMapping("/api/v1/managements")
public class ManagementController {
	
	@Autowired
	ManagementService managementService;
	
	
	@PostMapping("/addDetails")
	public void addManagementDetails(@RequestBody Management management) {
		managementService.createManagementDetails(management);
	}
	
	@GetMapping("/getAllRecords")
	public List<Management> getAllRecords(){
		return managementService.getAllRecords();
		
	}
	
	@GetMapping("/getAllRecords/page")
	public Page<Management> getRecordsByPage(@RequestParam("pageNo") Optional<Integer> pageNo,
			@RequestParam("pageSize") Optional<Integer> pageSize,
			@RequestParam("sort") Optional<String> sort
			){
		return managementService.getAllSortedRecordsByPageAndSize(pageNo,pageSize,sort);
	}
	
	@PutMapping("/updateDetails/{managementId}")
	public void updateManagementdetails(@RequestBody Management management, @PathVariable String managementId) {
		managementService.updateManagementDetails(management,managementId);
		
	}

}
