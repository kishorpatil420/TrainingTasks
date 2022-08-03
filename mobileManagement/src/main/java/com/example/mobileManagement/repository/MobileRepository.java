package com.example.mobileManagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.mobileManagement.entity.Mobile;

public interface MobileRepository extends JpaRepository<Mobile, String> {

}
