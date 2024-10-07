package com.example.Restaurantto.PDV.dto.FichaTecnica;

import java.util.List;
import java.util.UUID;

public record FichaTecnicaDto(UUID id, String nome, List<IngredientesDto> ingredientes) {}
