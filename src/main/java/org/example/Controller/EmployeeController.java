package org.example.Controller;

import org.example.Entity.Employee;
import org.example.Service.EmployeeServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EmployeeController
{
    @Autowired
    private EmployeeServices employeeServices;

    @GetMapping("/employee")
    public List<Employee> getEmployee()
    {
        return employeeServices.getAllEmployee();
    }

    @GetMapping("/employee/{id}")
    public Employee getEmployee(@PathVariable int id)
    {
        return employeeServices.getEmployeeById(id);
    }
}
