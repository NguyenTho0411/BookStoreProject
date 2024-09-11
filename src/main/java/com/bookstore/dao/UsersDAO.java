/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bookstore.dao;

import com.bookstore.entity.Users;
import jakarta.persistence.EntityManager;
import java.util.List;

/**
 *
 * @author DELL
 */
public class UsersDAO extends JpaDAO<Users> implements GenericDAO<Users> {

    public UsersDAO(EntityManager entityManager) {
        super(entityManager);
    }

    
    
    
    public Users create(Users user){
        return super.create(user);
    }

    @Override
    public Users update(Users user) {
        return super.update(user);
    }

    @Override
    public Users get(Object id) {
        return super.find(Users.class, id);
    }

    @Override
    public void delete(Object id) {
        super.delete(Users.class,id);
    }

    @Override
    public List<Users> listAll() {
        return super.findWithNameQuery("Users.findAll");
    }

    @Override
    public long count() {
        return super.countWithNameQuery("Users.countAll");
    }
  
    
}
