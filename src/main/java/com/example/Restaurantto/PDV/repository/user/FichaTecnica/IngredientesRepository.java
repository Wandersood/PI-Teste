package com.example.Restaurantto.PDV.repository.user.FichaTecnica;

import com.example.Restaurantto.PDV.model.user.fichaTecnica.Ingredientes;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface IngredientesRepository extends JpaRepository<Ingredientes, UUID> {
}
