package com.sample.service;

import com.sample.model.Customer;

import java.util.List;



public interface CustomerService {

	public List<Customer> getCustomers();
    public void saveCustomer(Customer theCustomer);
    public Customer getCustomer(int theId);

    public void deleteCustomer(int theId);
}
