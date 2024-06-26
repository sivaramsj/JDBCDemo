package org.example.service;

import org.example.dao.EmployeeDAOImplementation;
import org.example.models.Employees;

import java.util.List;

public class EmployeeService {
    EmployeeDAOImplementation dao;

    public EmployeeService() {
        this.dao = new EmployeeDAOImplementation();
    }

    //create new employee
    public void createEmployee(){
        Employees emp = new Employees(11,"siva","ram","2001-02-04","EmpID11.pic","Pro coder");
        System.out.println(dao.create(emp).getFirst_name()+" is created Successfully");;
    }

    public Employees getEmployee(){
        Employees emp = dao.get(1);
        return emp;
    }

    // get all Employees as a list
    public List<Employees> getAllEmployees(){
        List<Employees> employees = dao.getAll();
        return  employees;
    }

    // update employee
    public boolean updateEmployee(){
        String update_notes = "Good Person";
        Employees emp = this.dao.get(2);
        emp.setNotes(update_notes);

        return dao.update(emp);
    }

    // delete employee
    public boolean deleteEmployee(){
        return dao.delete(11);
    }
}
