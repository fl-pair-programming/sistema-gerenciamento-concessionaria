package com.concessionaria.Sistema_gerenciamento.reposity;

import com.concessionaria.Sistema_gerenciamento.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {


}
