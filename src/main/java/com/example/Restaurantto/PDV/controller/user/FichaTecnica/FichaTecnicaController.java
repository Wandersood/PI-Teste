package com.example.Restaurantto.PDV.controller.user.FichaTecnica;

import com.example.Restaurantto.PDV.dto.FichaTecnica.FichaTecnicaDto;
import com.example.Restaurantto.PDV.model.user.fichaTecnica.FichaTecnica;
import com.example.Restaurantto.PDV.service.FichaTecnica.FichaTecnicaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/ficha-tecnica")
public class FichaTecnicaController {

    @Autowired
    private FichaTecnicaService fichaTecnicaService;

    @PostMapping("/create")
    public ResponseEntity<FichaTecnicaDto> create(@RequestBody FichaTecnicaDto fichaTecnicaDto) {
        FichaTecnica fichaCriada = fichaTecnicaService.criarFichaTecnica(fichaTecnicaDto);
        return new ResponseEntity<>(new FichaTecnicaDto(fichaCriada.getId(), fichaCriada.getNome(), fichaCriada.getIngredientes()), HttpStatus.CREATED);
    }


    @PutMapping("/update/{id}")
    public ResponseEntity<Void> atualizarFichaTecnica(@PathVariable UUID id, @RequestBody FichaTecnicaDto fichaTecnicaDto) {
        fichaTecnicaService.atualizarFichaTecnica(id, fichaTecnicaDto);
        return ResponseEntity.ok().build();
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> deletarFichaTecnica(@PathVariable UUID id) {
        fichaTecnicaService.deletarFichaTecnica(id);
        return ResponseEntity.noContent().build();
    }

    @GetMapping("/list")
    public ResponseEntity<List<FichaTecnicaDto>> listarFichasTecnicas() {

        return ResponseEntity.ok(fichaTecnicaService.listarFichas());
    }

}
