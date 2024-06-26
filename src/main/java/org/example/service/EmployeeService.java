package org.example.service;

import org.example.dao.EmployeeDAOImplementation;
import org.example.models.Employees;

import java.util.List;

public class EmployeeService {
    EmployeeDAOImplementation dao;

    public EmployeeService() {
        this.dao = new EmployeeDAOImplementation();
    }


    // get all Employees as a list
    public List<Employees> getAllEmployees(){
        List<Employees> employees = dao.getAll();
        return  employees;
    }
}
