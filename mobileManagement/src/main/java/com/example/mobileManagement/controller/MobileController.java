package com.example.mobileManagement.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.mobileManagement.entity.Mobile;
import com.example.mobileManagement.service.MobileService;

@RestController
@RequestMapping("api/v1/mobile")
public class MobileController {
	
	
	@Autowired
	MobileService mobileService;
	
	@PostMapping("/addMobiles")
	public void addMobileDetails(@RequestBody Mobile mobile) {
		mobileService.addMobiledetails(mobile);
	}
	
	@GetMapping("/getAllRecords")
	public List<Mobile> getAllRecotds(){
		return mobileService.getAllRecords();
	}
	
	
	@GetMapping("/getRecordsBySort")
	public List<Mobile> findAllRecordsByBrandNameAsc(){
		return mobileService.findAllRecordsByBrandNameAsc();
	}
	
	@GetMapping("/getRecordsByDesc")
	public Page<Mobile> findAllRecordsByBrandNameDesc(@RequestParam("pageNo") Optional<Integer> pageNo,
			@RequestParam("pageSize") Optional<Integer> pageSize){
		return mobileService.findAllRecordsByBrandNameDesc(pageNo, pageSize);
		
	}
	

}
