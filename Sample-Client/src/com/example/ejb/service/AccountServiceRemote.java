/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.ejb.service;

import com.example.ejb.entity.Customer;
import java.util.List;
import javax.ejb.Remote;

/**
 *
 * @author Luis
 */
@Remote
public interface AccountServiceRemote {

    Customer createAccount(String firstName, String lastName);

    List<Customer> findAllCustomers();

}
