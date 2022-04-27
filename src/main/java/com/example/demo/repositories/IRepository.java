package com.example.demo.repositories;

import java.util.List;

public interface IRepository<T> {
    //ReadAll
    public List<T> getAllEntities();

    //ReadSingle
    public T getSingleById(int id);


    //Create
    public boolean create(T entity);

    //Update
    public boolean update(T entity);

    //Delete
    public boolean deleteById(int id);
}
