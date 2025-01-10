package com.shubham.employeeManagementApplication.Service;

import com.shubham.employeeManagementApplication.Entity.Employee;
import com.shubham.employeeManagementApplication.Repository.EmployeeRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    public EmployeeService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    private EmployeeRepository employeeRepository;


    public Employee addEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }
    public List<Employee> getAllEmployee() {
        return employeeRepository.findAll();
    }

    public Employee getEmployee(Integer eid) {
        return employeeRepository.findById(eid).orElse(new Employee());
    }

    public Employee updateEmployee(Integer eid, Employee employee) {
        Employee emp = employeeRepository.findById(eid).get();
        emp.setEmployeeFName(employee.getEmployeeFName());
        emp.setEmployeeLName(employee.getEmployeeLName());
        emp.setEmployeeAddress(employee.getEmployeeAddress());
        emp.setEmployeeSalary(employee.getEmployeeSalary());
        return employeeRepository.save(emp);
    }


    public String deleteEmployee(Integer id) {
        boolean flag = employeeRepository.findById(id).isEmpty();
        if(flag == true)
        {
            return "No Employee Found with Given id";
        }
        else{
            employeeRepository.deleteById(id);
        }
        return "Employee Deleted";
    }
}
