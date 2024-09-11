/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bookstore.service;

import com.bookstore.dao.UsersDAO;
import com.bookstore.entity.Users;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import java.util.List;

/**
 *
 * @author DELL
 */
public class UserServices {
    private EntityManagerFactory entityManagerFactory;  
    private UsersDAO userDAO;

    public UserServices() {
        entityManagerFactory = Persistence.createEntityManagerFactory("BookStoreWebsite");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
                
        userDAO =new UsersDAO(entityManager);
    }
    
    public List<Users> listUsers(){
        List<Users> listUsers = userDAO.listAll();
        return listUsers;
    }
}
