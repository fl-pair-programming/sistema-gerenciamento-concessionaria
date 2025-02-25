package com.concessionaria.Sistema_gerenciamento.service;

import com.concessionaria.Sistema_gerenciamento.model.Employee;
import com.concessionaria.Sistema_gerenciamento.model.User;
import com.concessionaria.Sistema_gerenciamento.reposity.EmployeeRepository;
import com.concessionaria.Sistema_gerenciamento.reposity.UserRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
@RequiredArgsConstructor
public class EmployeeServiceImpl implements EmployeeService{

    private final EmployeeRepository employeeRepository;
    private final UserRepository userRepository;

    @Override
    public List<Employee> list(){
        return employeeRepository.findAll();
    }

    @Override
    public Employee getById(Long id){
        return employeeRepository.findById(id)
                .orElseThrow(() -> new EmptyResultDataAccessException(1));
    }

    @Override
    public List<Employee> getByName(String name) {

        return employeeRepository.findByNameContainingIgnoreCase(name);
    }

    @Override
    public Employee createEmployee(Employee employee) {

        User user = employee.getUser();

        if(user != null) {
            if (user.getId() == null) {
                user = userRepository.save(user);
                employee.setUser(user);
            }
        }

        return employeeRepository.save(employee);
    }

    @Override
    public Employee updateEmployee(Long id, Employee employee) {
        Employee updatedEmployee = getById(id);
        BeanUtils.copyProperties(employee, updatedEmployee, "id");
        return employeeRepository.save(updatedEmployee);
    };

    @Override
    public void deleteEmployee(Long id) {
        employeeRepository.deleteById(id);
    }
}
