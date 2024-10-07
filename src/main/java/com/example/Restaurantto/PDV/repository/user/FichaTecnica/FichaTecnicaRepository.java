package com.example.Restaurantto.PDV.repository.user.FichaTecnica;

import com.example.Restaurantto.PDV.model.user.fichaTecnica.FichaTecnica;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface FichaTecnicaRepository extends JpaRepository<FichaTecnica, UUID> {
}
