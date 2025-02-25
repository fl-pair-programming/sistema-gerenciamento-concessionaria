package com.concessionaria.Sistema_gerenciamento.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class UserDto {

    private Long id;

    @NotBlank(message = "The name must no be blank")
    private String name;

    @NotBlank(message = "The e-mail must not be blank")
    private String email;

    @NotBlank(message = "The password must not be blank")
    private String password;

    @NotNull(message = "The profile ID is null")
    private Long profileId;
}
