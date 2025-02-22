package com.concessionaria.Sistema_gerenciamento.mapper;

import com.concessionaria.Sistema_gerenciamento.dto.UserDto;
import com.concessionaria.Sistema_gerenciamento.dto.UserSimplifiedDto;
import com.concessionaria.Sistema_gerenciamento.model.User;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserMapper {

    UserDto toDto (User user);

    User toEntity (UserDto userDto);

    UserSimplifiedDto toSimplifiedDto (User user);
}
