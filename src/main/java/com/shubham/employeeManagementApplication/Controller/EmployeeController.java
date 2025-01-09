package com.shubham.employeeManagementApplication.Controller;

import com.shubham.employeeManagementApplication.Entity.Employee;
import com.shubham.employeeManagementApplication.Service.EmployeeService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/employee")
public class EmployeeController {

    private EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @PostMapping("/add")
    public Employee addEmployee(@RequestBody Employee employee)
    {
       return employeeService.addEmployee(employee);
    }

    @GetMapping("/get/{employeeId}")
    public Employee getEmployee(@PathVariable("employeeId") Integer eid)
    {
        return employeeService.getEmployee(eid);
    }
}
