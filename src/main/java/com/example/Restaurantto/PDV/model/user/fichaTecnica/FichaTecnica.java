package com.example.Restaurantto.PDV.model.user.fichaTecnica;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;
import java.util.UUID;

@Setter
@Getter
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "ficha_tecnica")

public class FichaTecnica {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    private String nome;


    @OneToMany(mappedBy = "ficha_tecnica")
    private List<Ingredientes> ingredientes;

}
