package com.shubham.employeeManagementApplication.Repository;

import com.shubham.employeeManagementApplication.Entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
}
