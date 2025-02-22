package com.concessionaria.Sistema_gerenciamento.service;

import com.concessionaria.Sistema_gerenciamento.model.Customer;
import com.concessionaria.Sistema_gerenciamento.reposity.CustomerRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
@RequiredArgsConstructor
public class CustomerServiceImpl implements CustomerService{

    private final CustomerRepository customerRepository;

    @Override
    public List<Customer> list() {
        return customerRepository.findAll();
    }

    @Override
    public Customer getById (Long id){
        return customerRepository.findById(id).
                orElseThrow(() -> new EmptyResultDataAccessException(1));
    }

    @Override
    public Customer createNewCustomer(Customer customer) {
        return customerRepository.save(customer);
    }

    @Override
    public Customer updateCustomer(Long id, Customer customer){
        Customer updateCustomer = getById(id);
        BeanUtils.copyProperties(customer, updateCustomer, "id");
        return customerRepository.save(updateCustomer);
    }

    @Override
    public void deleteCustomer(Long id) {
        customerRepository.deleteById(id);
    }
}
