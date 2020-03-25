package com.anusha.assignment.Model;

import com.anusha.assignment.Employee;

import java.sql.*;

public class EmployeeModel {

    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost/newdb";

    static final String USER = "root";
    static final String PASS = "";

    public void connectToDB(){
        Connection conn = null;
        Statement stmt = null;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection(DB_URL,USER,PASS);

            System.out.println("Connected Successfully TO DB");
            stmt = conn.createStatement();

            stmt.close();
            conn.close();
        }catch(SQLException se){
            se.printStackTrace();
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            try{
                if(stmt!=null)
                    stmt.close();
            }catch(SQLException se2){
            }// nothing we can do
            try{
                if(conn!=null)
                    conn.close();
            }catch(SQLException se){
                se.printStackTrace();
            }
        }
    }

    public void InsertRecordInDB(Employee employee){
        Connection conn = null;
        Statement stmt = null;
        try{
            Class.forName("com.mysql.jdbc.Driver");

            connectToDB();
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
            System.out.println("Inserting records into the Employee Table ...");
            stmt = conn.createStatement();

            String sql = "INSERT INTO employee " +
                    "VALUES (0, '"+ employee.getFirstName()+"','"+ employee.getLastName()+"','"+ employee.getGender()+"','"+ employee.getHiredDate()+"','"+employee.getSalary()+"')";
            stmt.executeUpdate(sql);

            System.out.println("Inserting Success");

        }catch(SQLException se){
            se.printStackTrace();
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            try{
                if(stmt!=null)
                    conn.close();
            }catch(SQLException se){
            }
            try{
                if(conn!=null)
                    conn.close();
            }catch(SQLException se){
                se.printStackTrace();
            }
        }
    }

    public void UpdateRecordInDB(int empID, Employee employee){
        Connection conn = null;
        Statement stmt = null;
        try{
            Class.forName("com.mysql.jdbc.Driver");

            connectToDB();
            conn = DriverManager.getConnection(DB_URL, USER, PASS);

            stmt = conn.createStatement();
            String sql = "UPDATE employee " +
                    "SET FirstName = '"+employee.getFirstName()+"',LastName = '"+employee.getLastName()+"',Gender = '"+employee.getGender()+"',HiredDate = '"+employee.getHiredDate()+"',Salary = '"+employee.getSalary()+"' WHERE EmployeeID = "+empID;
            stmt.executeUpdate(sql);

            System.out.println("\n Update Success");

        }catch(SQLException se){
            se.printStackTrace();
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            try{
                if(stmt!=null)
                    conn.close();
            }catch(SQLException se){
            }// do nothing
            try{
                if(conn!=null)
                    conn.close();
            }catch(SQLException se){
                se.printStackTrace();
            }
        }
    }

    public void DeleteRecordFromDB(int empID){
        Connection conn = null;
        Statement stmt = null;
        try{
            Class.forName("com.mysql.jdbc.Driver");

            connectToDB();
            conn = DriverManager.getConnection(DB_URL, USER, PASS);

            stmt = conn.createStatement();
            String sql = "DELETE FROM employee " +
                    "WHERE EmployeeID = "+empID;
            stmt.executeUpdate(sql);

            System.out.println("\nDeleted Success\n");

        }catch(SQLException se){
            se.printStackTrace();
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            try{
                if(stmt!=null)
                    conn.close();
            }catch(SQLException se){
            }
            try{
                if(conn!=null)
                    conn.close();
            }catch(SQLException se){
                se.printStackTrace();
            }
        }
    }

    public void ViewRecord(int empID){
        Connection conn = null;
        Statement stmt = null;
        try{
            Class.forName("com.mysql.jdbc.Driver");

            connectToDB();
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
            stmt = conn.createStatement();

            String sql = "SELECT *FROM employee WHERE EmployeeID = "+empID;
            ResultSet rs = stmt.executeQuery(sql);

            while(rs.next()){
                int id  = rs.getInt("EmployeeID");
                int salary = rs.getInt("Salary");
                String first = rs.getString("FirstName");
                String last = rs.getString("LastName");
                String gender = rs.getString("Gender");
                String date = rs.getString("HiredDate");

                System.out.print("\nID: " + id+"\n");
                System.out.print("FirstName: " + first+"\n");
                System.out.print("LastName: " + last+"\n");
                System.out.print("Gender: " + gender+"\n");
                System.out.print("HiredDate: " + date+"\n");
                System.out.print("Salary: " + salary+"\n");


            }
            rs.close();
        }catch(SQLException se){
            //Handle errors for JDBC
            se.printStackTrace();
        }catch(Exception e){
            //Handle errors for Class.forName
            e.printStackTrace();
        }finally{
            //finally block used to close resources
            try{
                if(stmt!=null)
                    conn.close();
            }catch(SQLException se){
            }// do nothing
            try{
                if(conn!=null)
                    conn.close();
            }catch(SQLException se){
                se.printStackTrace();
            }//end finally try
        }
    }

    public void ViewAllRecord(){
        Connection conn = null;
        Statement stmt = null;
        try{
            Class.forName("com.mysql.jdbc.Driver");

            connectToDB();
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
            stmt = conn.createStatement();

            String sql = "SELECT *FROM employee";
            ResultSet rs = stmt.executeQuery(sql);

            while(rs.next()){
                int id  = rs.getInt("EmployeeID");
                int salary = rs.getInt("Salary");
                String first = rs.getString("FirstName");
                String last = rs.getString("LastName");
                String gender = rs.getString("Gender");
                String date = rs.getString("HiredDate");

                System.out.print("\nID: " + id+"\n");
                System.out.print("FirstName: " + first+"\n");
                System.out.print("LastName: " + last+"\n");
                System.out.print("Gender: " + gender+"\n");
                System.out.print("HiredDate: " + date+"\n");
                System.out.print("Salary: " + salary+"\n");


            }
            rs.close();
        }catch(SQLException se){
            //Handle errors for JDBC
            se.printStackTrace();
        }catch(Exception e){
            //Handle errors for Class.forName
            e.printStackTrace();
        }finally{
            //finally block used to close resources
            try{
                if(stmt!=null)
                    conn.close();
            }catch(SQLException se){
            }// do nothing
            try{
                if(conn!=null)
                    conn.close();
            }catch(SQLException se){
                se.printStackTrace();
            }//end finally try
        }
    }
}

