package com.example.studentManagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.studentManagement.entity.Student;

public interface StudentRepository extends JpaRepository<Student, String>{


}
