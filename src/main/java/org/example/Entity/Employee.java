package org.example.Entity;

public class Employee
{
    int emp_id;
    String name;

    public Employee(int emp_id, String name) {
        this.emp_id = emp_id;
        this.name = name;
    }

    public Employee() {
    }

    public int getEmp_id() {
        return emp_id;
    }

    public void setEmp_id(int emp_id) {
        this.emp_id = emp_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
