package com.smartcity.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.smartcity.entity.Department;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long> {

}
