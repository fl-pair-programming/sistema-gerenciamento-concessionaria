package com.concessionaria.Sistema_gerenciamento.reposity;

import com.concessionaria.Sistema_gerenciamento.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
