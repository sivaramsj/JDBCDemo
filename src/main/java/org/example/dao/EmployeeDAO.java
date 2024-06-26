package org.example.dao;

import java.util.List;

public interface EmployeeDAO<T>{
    public T create(T t);
    public T get(int id);
    public boolean update(T t);
    public boolean delete(int id);
    public List<T> getAll();
}
