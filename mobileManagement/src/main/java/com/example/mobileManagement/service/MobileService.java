package com.example.mobileManagement.service;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import com.example.mobileManagement.entity.Mobile;


@Service
public interface MobileService {

	void addMobiledetails(Mobile mobile);

	List<Mobile> getAllRecords();

	List<Mobile> findAllRecordsByBrandNameAsc();

	Page<Mobile> findAllRecordsByBrandNameDesc(Optional<Integer> pageNo, Optional<Integer> pageSize);

}
