package org.example.dao;

import org.example.connection.DBconnection;
import org.example.models.Employees;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class EmployeeDAOImplementation implements EmployeeDAO<Employees>{
    Connection conn;

    public EmployeeDAOImplementation() {
        conn = DBconnection.getConnection();
    }

    @Override
    public Employees create() {
        return null;
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
