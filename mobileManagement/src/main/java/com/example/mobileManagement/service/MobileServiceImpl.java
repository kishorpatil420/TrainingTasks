package com.example.mobileManagement.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;

import com.example.mobileManagement.entity.Mobile;
import com.example.mobileManagement.repository.MobileRepository;

@Service
public class MobileServiceImpl implements MobileService {

	@Autowired
	MobileRepository mobileRepository;
	@Override
	public void addMobiledetails(Mobile mobile) {
		// TODO Auto-generated method stub
		mobileRepository.save(mobile);
		
	}
	@Override
	public List<Mobile> getAllRecords() {
		// TODO Auto-generated method stub
		List<Mobile> mobile = mobileRepository.findAll();
		return mobile;
	}
	@Override
	public List<Mobile> findAllRecordsByBrandNameAsc() {
		// TODO Auto-generated method stub
		
		List<Mobile> mobile = mobileRepository.findAll(Sort.by(Sort.Direction.ASC, "mobileBrand"));
		return mobile;
	}
	@Override
	public Page<Mobile> findAllRecordsByBrandNameDesc(Optional<Integer> pageNo, Optional<Integer> pageSize) {
		// TODO Auto-generated method stub
		
		Page<Mobile> mobile = mobileRepository.findAll(PageRequest.of(pageNo.orElse(0), pageSize.orElse(6),Direction.DESC,"mobileBrand"));
		return mobile;
	}

}
