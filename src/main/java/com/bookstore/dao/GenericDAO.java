/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.bookstore.dao;

import java.util.List;

/**
 *
 * @author DELL
 */
public interface GenericDAO<T> {
    public T create(T t);
    public T update(T t);
    public T get(Object id);
    public void delete(Object id);
    
    public List<T> listAll();
    public long count();
    
}
