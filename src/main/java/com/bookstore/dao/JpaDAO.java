/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bookstore.dao;

import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import java.util.List;

/**
 *
 * @author DELL
 */
public class JpaDAO<E> {

    protected EntityManager entityManager;

    public JpaDAO(EntityManager entityManager) {
        super();
        this.entityManager = entityManager;
    }

    public E create(E entity) {
        entityManager.getTransaction().begin();
        entityManager.persist(entity);
        entityManager.flush();
        entityManager.refresh(entity);
        entityManager.getTransaction().commit();

        return entity;
    }

    public E update(E entity) {
        entityManager.getTransaction().begin();
        entity = entityManager.merge(entity);
        entityManager.getTransaction().commit();
        return entity;
    }

    public E find(Class<E> type, Object id) {
        E entity = entityManager.find(type, id);
        if (entity != null) {
            entityManager.refresh(entity);
        }
        return entity;
    }
    public void delete(Class<E> type, Object id){
        entityManager.getTransaction().begin();
        Object reference = entityManager.getReference(type, id);
        entityManager.remove(reference);
        entityManager.getTransaction().commit();
    }
    public List<E> findWithNameQuery(String queryName){
        Query query = entityManager.createNamedQuery(queryName);
        return query.getResultList();
    }
    public long countWithNameQuery(String queryName){
        Query query = entityManager.createNamedQuery(queryName);
        return (long)query.getSingleResult();
    }

}
