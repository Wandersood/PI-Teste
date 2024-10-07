package com.example.Restaurantto.PDV.service.FichaTecnica;

import com.example.Restaurantto.PDV.dto.FichaTecnica.FichaTecnicaDto;
import com.example.Restaurantto.PDV.model.user.fichaTecnica.FichaTecnica;
import com.example.Restaurantto.PDV.repository.user.FichaTecnica.FichaTecnicaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.UUID;
@Service
public class FichaTecnicaService {

    @Autowired
    public FichaTecnicaRepository fichaTecnicaRepository;

    public UUID criarFichaTecnica(FichaTecnicaDto fichaTecnicaDto){
        FichaTecnica ficha = new FichaTecnica();
        ficha.setNome(fichaTecnicaDto.nome());
        ficha.setIngredientes(fichaTecnicaDto.ingredientes());
        fichaTecnicaRepository.save(ficha);
        return ficha.getId();

    }

    public List<FichaTecnica> listarFichas() {
        return fichaTecnicaRepository.findAll();
    }

    public FichaTecnica buscarFichaTecnica(UUID id, FichaTecnicaDto fichaTecnicaDto) {
        FichaTecnica fichaExistente = buscarFichaTecnica(id);
        fichaExistente.setNome(fichaTecnicaDto.nome());
        fichaExistente.setIngredientes(fichaTecnicaDto.ingredientes());
        fichaTecnicaRepository.save(fichaExistente);
    }


    public void deletarFichaTecnica(UUID id) {
        FichaTecnica ficha = buscarFichaTecnica(id);
        fichaTecnicaRepository.deleteById(ficha);
    }

    public FichaTecnica atualizarFichaTecnica(UUID id, FichaTecnicaDto fichaTecnicaDto) {
        FichaTecnica fichaExistente = buscarFichaTecnica(id);
        fichaExistente.setNome(fichaTecnicaDto.nome());
        fichaExistente.setIngredientes(fichaTecnicaDto.ingredientes());
        fichaTecnicaRepository.save(fichaExistente);
    }



}
