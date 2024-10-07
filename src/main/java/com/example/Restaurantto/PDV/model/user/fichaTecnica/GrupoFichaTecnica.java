package com.example.Restaurantto.PDV.model.user.fichaTecnica;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.UUID;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "grupo_ficha_tecnica")


public class GrupoFichaTecnica {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private UUID id;
    private String nome;

    @OneToMany(mappedBy = "grupoFichaTecnica", cascade = CascadeType.ALL)
    private List<FichaTecnica> fichasTecnicas;


}
