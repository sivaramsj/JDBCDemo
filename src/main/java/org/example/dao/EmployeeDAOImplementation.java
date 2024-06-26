package org.example.dao;

import org.example.connection.DBconnection;
import org.example.models.Employees;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class EmployeeDAOImplementation implements EmployeeDAO<Employees>{
    Connection conn;

    public EmployeeDAOImplementation() {
        conn = DBconnection.getConnection();
    }

    @Override
    public Employees create(Employees employee) {
        String query = "insert into employees(EmployeeID,FirstName,LastName,BirthDate,Photo,Notes) value (?,?,?,?,?,?)";
        try {
            PreparedStatement pt = conn.prepareStatement(query);
            pt.setInt(1,employee.getEmployee_id());
            pt.setString(2,employee.getFirst_name());
            pt.setString(3,employee.getLast_name());
            pt.setString(4,employee.getBirth_date());
            pt.setString(5,employee.getPhoto());
            pt.setString(6,employee.getNotes());
            int rows = pt.executeUpdate();
            System.out.println("No.of Rows affected : "+rows);
            return  employee;
        }catch (SQLException e) {
            System.out.println(e.getMessage());
        }
       return  null;
    }

    @Override
    public Employees get() {
        return  null;
    }


    @Override
    public List<Employees> getAll() {
        try {
            List<Employees> employees = new ArrayList<>();
            Statement st = conn.createStatement();
            String query = "select * from employees order by BirthDate desc";
            ResultSet rs = st.executeQuery(query);

            while(rs.next()){
                Employees employee = new Employees();
                employee.setEmployee_id(rs.getInt("EmployeeID"));
                employee.setFirst_name(rs.getString("FirstName"));
                employee.setLast_name(rs.getString("LastName"));
                employee.setBirth_date(rs.getString("BirthDate"));
                employee.setPhoto(rs.getString("Photo"));
                employee.setNotes(rs.getString("Notes"));

                employees.add(employee);
            }

            return employees;

        }
        catch (SQLException e) {
            e.getMessage();
        }

//        return List.of();
        return  null;
    }


    @Override
    public Employees update() {
        return null;
    }

    @Override
    public Employees delete() {
        return null;
    }

}
