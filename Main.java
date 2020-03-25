package com.anusha.assignment;

import com.anusha.assignment.Controller.EmployeeController;
import com.anusha.assignment.Model.EmployeeModel;
import com.anusha.assignment.View.EmployeeView;

import java.sql.*;

public class Main {

    public static void main(String[] args) {
        EmployeeController employeeController = new EmployeeController();
        employeeController.menuselection();
    }
}

