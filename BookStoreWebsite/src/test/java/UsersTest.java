
import com.bookstore.entity.Users;
import jakarta.persistence.Persistence;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;






/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author DELL
 */
public class UsersTest {
    public static void main(String[] args) {
        Users user1 = new Users();
        user1.setEmail("phamanhq411@gmail.com");
        user1.setFullName("Pham Anh Quan");
        user1.setPassword("0411");
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("BookStoreWebsite");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
        entityManager.persist(user1);
        entityManager.getTransaction().commit();
        entityManagerFactory.close();
        
        System.out.println("A object was persisted ");
        
    }
}
