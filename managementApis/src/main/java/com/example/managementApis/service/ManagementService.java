package com.example.managementApis.service;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import com.example.managementApis.entity.Management;


@Service
public interface ManagementService {

	void createManagementDetails(Management management);

	List<Management> getAllRecords();

	Page<Management> getAllSortedRecordsByPageAndSize(Optional<Integer> pageNo, Optional<Integer> pageSize,
			Optional<String> sort);

	void updateManagementDetails(Management management, String managementId);

}
