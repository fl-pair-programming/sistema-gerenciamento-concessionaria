package com.concessionaria.Sistema_gerenciamento.mapper;

import com.concessionaria.Sistema_gerenciamento.dto.CustomerSimplifiedDto;
import com.concessionaria.Sistema_gerenciamento.dto.EmployeeDto;
import com.concessionaria.Sistema_gerenciamento.dto.EmployeeSimplifiedDto;
import com.concessionaria.Sistema_gerenciamento.model.Customer;
import com.concessionaria.Sistema_gerenciamento.model.Employee;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface EmployeeMapper {

    EmployeeDto toDto (Employee employee);

    EmployeeSimplifiedDto toSimplifiedDto (Employee employee);

    Employee toEntity (EmployeeDto employeeDto);

    Employee toSimplifiedEntity (EmployeeSimplifiedDto employeeSimplifiedDto);
}
