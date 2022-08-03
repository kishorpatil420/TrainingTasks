package com.example.managementApis.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;

import com.example.managementApis.entity.Management;
import com.example.managementApis.repository.ManagementRepository;


@Service
public class ManagementServiceImpl implements ManagementService{

	
	@Autowired
	ManagementRepository managementRepository;
	@Override
	public void createManagementDetails(Management management) {
		// TODO Auto-generated method stub
		managementRepository.save(management);
		
	}
	@Override
	public List<Management> getAllRecords() {
		// TODO Auto-generated method stub\
		List<Management> managements = managementRepository.findAll();
		return managements;
	}
	@Override
	public Page<Management> getAllSortedRecordsByPageAndSize(Optional<Integer> pageNo, Optional<Integer> pageSize,
			Optional<String> sort) {
		// TODO Auto-generated method stub
		return managementRepository.findAll(PageRequest.of(pageNo.orElse(0),
				pageSize.orElse(5),Direction.ASC,sort.orElse("managementId")));
	}
	@Override
	public void updateManagementDetails(Management management, String managementId) {
		// TODO Auto-generated method stub
		Optional<Management> managementDetails = managementRepository.findById(managementId);
		if(managementDetails.isPresent()) {
			managementRepository.save(management);
		}
		
		
	}

}
