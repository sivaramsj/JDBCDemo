package org.example;

import org.example.models.Employees;
import org.example.service.EmployeeService;

public class App {
    static EmployeeService service = new EmployeeService();

    public static void displayAllEmployee(){
        for(Employees emp : service.getAllEmployees())
            System.out.println(emp);
    }
}
