package com.example.demo.services;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



import com.example.demo.model.Customer;
import com.example.demo.repos.CustomerRepositoryImpl;



@Service
public class CustomerService {
    
    @Autowired
    private CustomerRepositoryImpl repo;
	public Object findAll;
    
    public boolean save(Customer entity) {
        return this.repo.save(entity);// its not this.save() its this.repo.save() is other is done leads to recurssion.
    }
    
    public  List<Customer> findAll() {
        return this.repo.findAll();
        
    }



}