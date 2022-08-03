package com.example.managementApis.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.managementApis.entity.Management;

public interface ManagementRepository extends JpaRepository<Management, String>{

}
