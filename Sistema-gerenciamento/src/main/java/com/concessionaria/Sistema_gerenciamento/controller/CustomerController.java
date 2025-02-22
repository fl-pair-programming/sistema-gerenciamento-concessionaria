package com.concessionaria.Sistema_gerenciamento.controller;

import com.concessionaria.Sistema_gerenciamento.dto.CustomerDto;
import com.concessionaria.Sistema_gerenciamento.dto.CustomerSimplifiedDto;
import com.concessionaria.Sistema_gerenciamento.mapper.CustomerMapper;
import com.concessionaria.Sistema_gerenciamento.model.Customer;
import com.concessionaria.Sistema_gerenciamento.service.CustomerService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping
public class CustomerController {

    private final CustomerService customerService;
    private final CustomerMapper customerMapper;

    @GetMapping("/customers")
    public ResponseEntity<List<CustomerDto>> list() {

        List<Customer> customers = customerService.list();
        List<CustomerDto> customerDtos = Collections.singletonList(customerMapper.toDto((Customer) customers));

        return ResponseEntity.ok(customerDtos);
    }

    @GetMapping("/customers/{id}")
    public ResponseEntity<CustomerDto> getById(@PathVariable Long id) {
        Customer customer = customerService.getById(id);
        CustomerDto customerDto = customerMapper.toDto(customer);

        return ResponseEntity.ok(customerDto);
    }

    @PostMapping("/customers")
    public ResponseEntity<CustomerDto> createNewCustomer(@RequestBody @Valid CustomerDto customerDto){
        Customer customer = customerMapper.toEntity(customerDto);
        Customer savedCustomer = customerService.createNewCustomer(customer);
        CustomerDto savedCustomerDto = customerMapper.toDto(savedCustomer);

        return ResponseEntity.status(HttpStatus.CREATED).body(savedCustomerDto);
    }

    @PutMapping("/customers/{id}")
    public ResponseEntity<CustomerSimplifiedDto> updateCustomer(@PathVariable Long id, @RequestBody @Valid CustomerSimplifiedDto customerSimplifiedDto){
        Customer customer = customerMapper.toSimplifiedEntity(customerSimplifiedDto);
        Customer updatedCustomer = customerService.updateCustomer(id, customer);
        CustomerSimplifiedDto savedCustomerSimplifiedDto = customerMapper.toSimplidiedDto(updatedCustomer);

        return ResponseEntity.ok(savedCustomerSimplifiedDto);
    }

    @DeleteMapping("/customers/{id}")
    public ResponseEntity<Void> deleteCustomer(@PathVariable Long id){
        customerService.deleteCustomer(id);

        return ResponseEntity.noContent().build();
    }
}
