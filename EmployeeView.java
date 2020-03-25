package com.anusha.assignment.View;

import com.anusha.assignment.Employee;
import com.anusha.assignment.Model.EmployeeModel;

import java.util.Scanner;

public class EmployeeView {

    String fn, ln, gender, hd;
    double salary;

    public int showMenu(){

        Scanner input = new Scanner(System.in);

        /***************************************************/

        System.out.println("Choose from these choices");
        System.out.println("-------------------------\n");
        System.out.println("1 - Insert Employee");
        System.out.println("2 - Update Employee");
        System.out.println("3 - Delete Employee");
        System.out.println("4 - View Employee");
        System.out.println("5 - View All Employee");
        System.out.println("6 - Quit");

        System.out.println("\nEnter Number : ");
        int selection = input.nextInt();

        return selection;
    }

    public Employee showInsertMenu(){
        System.out.println("Insert Menu \n");
        Scanner input = new Scanner(System.in);

        System.out.println("Enter FirstName : ");
        fn = input.next();

        System.out.println("Enter LastName : ");
        ln = input.next();

        System.out.println("Enter Gender : ");
        gender = input.next();

        System.out.println("Enter Hired Date year/month/date : ");
        hd = input.next();

        System.out.println("Enter Salary : ");
        salary = input.nextDouble();

        Employee employee = new Employee(0,fn,ln,gender,hd,salary);
        return employee;
    }

    public Employee showUpdateMenu(){
        System.out.println("Update Menu \n");

        Scanner input = new Scanner(System.in);
        System.out.println("Enter FirstName : ");
        fn = input.next();

        System.out.println("Enter LastName : ");
        ln = input.next();

        System.out.println("Enter Gender : ");
        gender = input.next();

        System.out.println("Enter Hired Date year/month/date : ");
        hd = input.next();

        System.out.println("Enter Salary : ");
        salary = input.nextDouble();

        Employee employee = new Employee(0,fn,ln,gender,hd,salary);
        return employee;
    }

}
