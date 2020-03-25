package com.anusha.assignment;

public class Employee {

    private int EmployeeID;
    private String FirstName;
    private String LastName;
    private String Gender;
    private String HiredDate;
    private double Salary;

    public Employee(int employeeID, String firstName, String lastName, String gender, String hiredDate, double salary) {
        EmployeeID = employeeID;
        FirstName = firstName;
        LastName = lastName;
        Gender = gender;
        HiredDate = hiredDate;
        Salary = salary;
    }

    public int getEmployeeID() {
        return EmployeeID;
    }

    public void setEmployeeID(int employeeID) {
        EmployeeID = employeeID;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String gender) {
        Gender = gender;
    }

    public String getHiredDate() {
        return HiredDate;
    }

    public void setHiredDate(String hiredDate) {
        HiredDate = hiredDate;
    }

    public double getSalary() {
        return Salary;
    }

    public void setSalary(double salary) {
        Salary = salary;
    }
}
