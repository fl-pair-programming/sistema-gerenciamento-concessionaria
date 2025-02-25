package com.concessionaria.Sistema_gerenciamento.controller;

import com.concessionaria.Sistema_gerenciamento.dto.EmployeeDto;
import com.concessionaria.Sistema_gerenciamento.mapper.EmployeeMapper;
import com.concessionaria.Sistema_gerenciamento.model.Employee;
import com.concessionaria.Sistema_gerenciamento.service.EmployeeService;
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
public class EmployeeController {

    private final EmployeeService employeeService;
    private final EmployeeMapper employeeMapper;

    @GetMapping("/employees")
    public ResponseEntity<List<EmployeeDto>> list() {

        List<Employee> employees = employeeService.list();
        List<EmployeeDto> employeeDtos = Collections
                .singletonList(employeeMapper
                        .toDto((Employee) employees));

        return ResponseEntity.ok(employeeDtos);
    }

    @GetMapping("/customer/{id}")
    public ResponseEntity<EmployeeDto> getById(@PathVariable Long id) {
        Employee employee = employeeService.getById(id);
        EmployeeDto employeeDto = employeeMapper.toDto(employee);

        return ResponseEntity.ok(employeeDto);
    };

    @GetMapping("/customer/{name}")
    public ResponseEntity<List<EmployeeDto>> getByName(@PathVariable String name) {
        List<Employee> employeesByName = employeeService.getByName(name);
        List<EmployeeDto> employeeDtos = Collections.singletonList(employeeMapper
                .toDto((Employee) employeesByName));

        return ResponseEntity.ok(employeeDtos);
    }

    @PostMapping("/customer")
    public ResponseEntity<EmployeeDto> createEmployee(@RequestBody @Valid EmployeeDto employeeDto) {
        Employee employee = employeeMapper.toEntity(employeeDto);
        Employee savedEmployee = employeeService.createEmployee(employee);
        EmployeeDto savedEmployeeDto = employeeMapper.toDto(savedEmployee);

        return ResponseEntity.status(HttpStatus.CREATED).body(savedEmployeeDto);
    }

//    @PutMapping("")

    @DeleteMapping("/customer/{id}")
    public ResponseEntity<Void> deleteEmployee(@PathVariable Long id) {
        employeeService.deleteEmployee(id);

        return ResponseEntity.noContent().build();
    }
}
