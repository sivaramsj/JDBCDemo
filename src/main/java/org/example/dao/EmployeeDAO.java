package org.example.dao;

import java.util.List;

public interface EmployeeDAO<T>{
    public T create(T t);
    public T get();
    public T update();
    public T delete();
    public List<T> getAll();
}
