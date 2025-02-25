package com.concessionaria.Sistema_gerenciamento.service;

import com.concessionaria.Sistema_gerenciamento.model.Customer;

import java.util.List;

public interface CustomerService {
    List<Customer> list();

    Customer getById (Long id);

    Customer createCustomer(Customer customer);

    Customer updateCustomer(Long id, Customer customer);

    void deleteCustomer(Long id);
}
