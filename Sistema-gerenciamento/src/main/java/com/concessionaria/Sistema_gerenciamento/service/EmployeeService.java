package com.concessionaria.Sistema_gerenciamento.service;

import com.concessionaria.Sistema_gerenciamento.model.Employee;

import java.util.List;

public interface EmployeeService {

    List<Employee> list();

    Employee getById (Long id);

    List<Employee> getByName (String name);

    Employee createEmployee (Employee employee);

    Employee updateEmployee (Long id, Employee employee);

    void deleteEmployee (Long  id);
}
