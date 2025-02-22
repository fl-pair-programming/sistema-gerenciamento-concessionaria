package com.concessionaria.Sistema_gerenciamento.mapper;

import com.concessionaria.Sistema_gerenciamento.dto.VehicleDto;
import com.concessionaria.Sistema_gerenciamento.model.Vehicle;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface VehicleMapper {

    VehicleDto toDto (Vehicle vehicle);

    Vehicle toEntity (VehicleDto vehicleDto);

}
