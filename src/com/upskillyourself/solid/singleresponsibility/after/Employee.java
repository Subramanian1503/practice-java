package com.upskillyourself.solid.singleresponsibility.after;

public class Employee extends Human{

    private Integer salary;

    private Integer employeeId;

    public Employee(String name, String gender, String phoneNumber, String address, Integer salary, Integer employeeId) {
        super(name, gender, phoneNumber, address);
        this.salary = salary;
        this.employeeId = employeeId;
    }

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    public Integer getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Integer employeeId) {
        this.employeeId = employeeId;
    }
}
