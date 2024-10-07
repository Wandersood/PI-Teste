package com.example.Restaurantto.PDV.dto.user;

import com.example.Restaurantto.PDV.enums.Role;
import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.List;
import java.util.UUID;

public record UserDTO(UUID id,
                      String email,
                      List<Role> roles,
                      String fullName,
                      String phone,
                      String cpf,
                      String cep,
                      String address,
                      int addressNumber,
                      String city,
                      String state,
                      String neighborhood,
                      String cnpj,
                      String message,
                      String enterprise,
                      Boolean isProspecting,
                      @JsonIgnore String password) {
}
