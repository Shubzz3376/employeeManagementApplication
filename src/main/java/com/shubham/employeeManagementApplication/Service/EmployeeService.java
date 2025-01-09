package com.shubham.employeeManagementApplication.Service;

import com.shubham.employeeManagementApplication.Entity.Employee;
import com.shubham.employeeManagementApplication.Repository.EmployeeRepository;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

    public EmployeeService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    private EmployeeRepository employeeRepository;


    public Employee addEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    public Employee getEmployee(Integer eid) {
        return employeeRepository.findById(eid).orElse(new Employee());
    }
}
