package com.concessionaria.Sistema_gerenciamento.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class VehicleDto {

    private Long id;

    @NotBlank(message = "The Brand must not be blank")
    private String brand;

    @NotBlank(message = "The Model must not be blank")
    private String model;

    @NotBlank(message = "The Engine must not be blank")
    private String engine;

    @NotBlank(message = "The Color must not be blank")
    private String color;

    private String order_service;

    @NotBlank(message = "The Vehicle status must not be blank")
    private String vehicle_status;

    @NotNull(message = "The customer ID must not be null")
    private Long customerId;
}
