/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.bookstore.dao;
import com.bookstore.entity.Users;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityNotFoundException;
import jakarta.persistence.Persistence;
import java.util.List;

import org.junit.AfterClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.BeforeClass;

/**
 *
 * @author DELL
 */
public class UserDAOTest {
    private static EntityManagerFactory entityManagerFactory;
    private static EntityManager entityManager;
    private static UsersDAO userDAO;
    
    @BeforeClass
    public static void setUpClass(){
        entityManagerFactory = Persistence.createEntityManagerFactory("BookStoreWebsite");
        entityManager = entityManagerFactory.createEntityManager();
        userDAO = new UsersDAO(entityManager);
    }
    
//    @Test
//    public void testCreateUsers(){
//        Users user = new Users();
//        user.setEmail("nguyenminhtien3108@gmail.com");
//        user.setFullName("Nguyen Minh Tien");
//        user.setPassword("0411");
//        user = userDAO.create(user);
//        assertTrue(user.getUserId()>0);
//    }
//    @Test(expected = PersistenceException.class)
//    public void testCreateUsersNoFields(){
//        Users user = new Users();
//        user = userDAO.create(user);
//        assertTrue(user.getUserId()>0);
//    }
//    @Test
//    public void testUpdateUser(){
//        Users user  = new Users();
//        user.setUserId(11);
//        user.setEmail("nguyenductho0411@gmail.com");
//        user.setFullName("Nguyen Huu Duc Tho");
//        user.setPassword("0411");
//        
//        user = userDAO.update(user);
//        
//        String expected = "nguyenductho0411@gmail.com";
//        String actual = user.getEmail();
//        assertEquals(expected,actual);
//        
//    }
//    @Test
//    public void testGetUserFound(){
//        Integer userId = 11;
//        Users user = userDAO.get(userId);
//        System.out.println(user.getEmail());
//        assertNotNull(user);
//    }
//        @Test
//    public void testGetUserNotFound(){
//        Integer userId = 99;
//        Users user = userDAO.get(userId);
//        assertNull(user);
//    }
//    @Test
//    public void testDeleteUser(){
//        Integer userID=18;
//        userDAO.delete(userID);
//        Users user = userDAO.get(userID);
//        assertNull(user);
//    }
//    @Test(expected = EntityNotFoundException.class)
//    public void testDeleteNonUser(){
//        Integer userID=18;
//        userDAO.delete(userID);
//
//    }
//    @Test
//    public void testListAll(){
//        List<Users> listAll = userDAO.listAll();
//        for(Users user: listAll){
//            System.out.println(user.getEmail());
//        }
//        assertTrue(listAll.size()>0);
//    }
    @Test
    public void testCount(){
        long totalUser = userDAO.count();
        assertEquals(4,totalUser);
    }
            
    @AfterClass
    public static void tearDownClass(){
        entityManager.close();
        entityManagerFactory.close();
    }
    
}
