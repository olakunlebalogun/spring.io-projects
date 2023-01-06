package com.olakunle.springrestfulservices.repository;

import com.olakunle.springrestfulservices.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
