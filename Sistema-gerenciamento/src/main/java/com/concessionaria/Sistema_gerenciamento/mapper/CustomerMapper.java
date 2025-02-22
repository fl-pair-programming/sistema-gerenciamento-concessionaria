package com.concessionaria.Sistema_gerenciamento.mapper;

import com.concessionaria.Sistema_gerenciamento.dto.CustomerDto;
import com.concessionaria.Sistema_gerenciamento.dto.CustomerSimplifiedDto;
import com.concessionaria.Sistema_gerenciamento.model.Customer;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CustomerMapper {

    CustomerDto toDto (Customer customer);

    CustomerSimplifiedDto toSimplidiedDto(Customer customer);

    Customer toEntity (CustomerDto customerDto);

    Customer toSimplifiedEntity (CustomerSimplifiedDto customerSimplifiedDto);
}
