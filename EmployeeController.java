package com.anusha.assignment.Controller;

import com.anusha.assignment.Employee;
import com.anusha.assignment.Model.EmployeeModel;
import com.anusha.assignment.View.EmployeeView;

import java.util.Scanner;

public class EmployeeController {

    Scanner input = new Scanner(System.in);

    public void menuselection(){
        EmployeeView employeeView = new EmployeeView();
        int sel = employeeView.showMenu();

        switch (sel){
            case 1:
                Employee employee = employeeView.showInsertMenu();
                EmployeeModel em = new EmployeeModel();
                em.InsertRecordInDB(employee);
                employeeView.showMenu();
                break;

            case 2:
                System.out.println("\nEnter Employee ID");
                int empId = input.nextInt();
                Employee employee1 = employeeView.showUpdateMenu();
                EmployeeModel em1 = new EmployeeModel();
                em1.UpdateRecordInDB(empId,employee1);
                break;

            case 3:
                System.out.println("\nEnter Employee ID");
                int empId1 = input.nextInt();
                EmployeeModel employeeModel = new EmployeeModel();
                employeeModel.DeleteRecordFromDB(empId1);
                break;

            case 4:
                System.out.println("\nEnter Employee ID");
                int empId2 = input.nextInt();
                EmployeeModel employeeModel1 = new EmployeeModel();
                employeeModel1.ViewRecord(empId2);
                break;

            case 5:
                EmployeeModel employeeModel2 = new EmployeeModel();
                employeeModel2.ViewAllRecord();
                break;

            case 6:
                break;

            default:
                System.out.println("Wrong Input");
                employeeView.showMenu();
                break;
        }
    }

}
