/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.ejb.service;

import com.example.ejb.entity.Customer;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

/**
 *
 * @author Luis
 */
@Stateless
public class AccountService implements AccountServiceRemote {
    
    @PersistenceContext
    private EntityManager em;
    
    @Override
    public Customer createAccount(String firstName, String lastName) {
        Customer customer = new Customer();
        customer.setFirstName(firstName);
        customer.setLastName(lastName);
        
        em.persist(customer);
        
        return customer;
    }

    
    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")

    @Override
    public List<Customer> findAllCustomers() {
        
        TypedQuery<Customer> query = em.createQuery(
            "SELECT c FROM Customer c",Customer.class);
        
        return query.getResultList();
    }
}
