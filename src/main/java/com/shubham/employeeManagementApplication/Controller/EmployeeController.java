package com.shubham.employeeManagementApplication.Controller;

import com.shubham.employeeManagementApplication.Entity.Employee;
import com.shubham.employeeManagementApplication.Service.EmployeeService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/employee")
public class EmployeeController {

    private EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @PostMapping("/add")
    public Employee addEmployee(@RequestBody Employee employee) {
        return employeeService.addEmployee(employee);
    }

    @GetMapping("/get/{employeeId}")
    public Employee getEmployee(@PathVariable("employeeId") Integer eid) {
        return employeeService.getEmployee(eid);
    }
    @GetMapping("/getAll")
    public List<Employee> getAllEmployee()
    {
        return employeeService.getAllEmployee();
    }

    @PutMapping("/update/{employeeId}")
    public Employee updateEmployee(@PathVariable("employeeId") Integer eid, @RequestBody  Employee employee)
    {
        return employeeService.updateEmployee(eid,employee);
    }

    @DeleteMapping("/delete/{employeeId}")
    public String deleteEmployee(@PathVariable("employeeId") Integer id)
    {
        return employeeService.deleteEmployee(id);
    }
}

