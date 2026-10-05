package org.example.Service;

import org.example.Entity.Employee;
import org.example.Exception.EmployeeNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class EmployeeServices {

    public static List<Employee> employees = Arrays.asList(
            new Employee(1, "Yogesh"),
            new Employee(2, "Rahul")
    );

    public List<Employee> getAllEmployee()
    {
        return employees;
    }

    public Employee getEmployeeById(int id)
    {
        return employees.stream()
                .filter(x-> x.getEmp_id() == id)
                .findFirst()
                .orElseThrow(() -> new EmployeeNotFoundException("Employee not found with id "+id));
    }
}
