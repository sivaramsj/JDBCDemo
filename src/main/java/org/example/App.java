package org.example;

import org.example.models.Employees;
import org.example.service.EmployeeService;

public class App {
    static EmployeeService service = new EmployeeService();


    public static  void createEmployee(){
        service.createEmployee();
    }

    public static void displayEmployee(){
        System.out.println(service.getEmployee());
    }

    public static void displayAllEmployee(){
        for(Employees emp : service.getAllEmployees())
            System.out.println(emp);
    }

    public static void updateEmployee(){
        if(service.updateEmployee())
            System.out.println("Record Updated Successfully");
        else
            System.out.println("Error Occured : While Updating Record ");
    }

    public static void deleteEmployee(){
        if(service.deleteEmployee())
            System.out.println("Record Deleted Successfully");
        else
            System.out.println("Error Occured : While Deleting Record ");
    }
}
