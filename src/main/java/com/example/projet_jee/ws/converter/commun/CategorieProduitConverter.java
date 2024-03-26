package com.example.projet_jee.ws.converter.commun;

import com.example.projet_jee.beans.commun.CategorieProduit;
import com.example.projet_jee.beans.commun.Produit;
import com.example.projet_jee.ws.dto.commun.CategorieProduitDto;
import com.example.projet_jee.ws.dto.commun.ProduitDto;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class CategorieProduitConverter {

    public CategorieProduit toBean(CategorieProduitDto categorieProduitDto){
        CategorieProduit categorieProduit = new CategorieProduit();
        categorieProduit.setId(categorieProduitDto.getId());
        categorieProduit.setCode(categorieProduitDto.getCode());
        categorieProduit.setLibelle(categorieProduitDto.getLibelle());
        return categorieProduit;
    }


    public CategorieProduitDto toDto(CategorieProduit categorieProduit){
        CategorieProduitDto categorieProduitDto = new CategorieProduitDto();
        categorieProduitDto.setId(categorieProduit.getId());
        categorieProduitDto.setCode(categorieProduit.getCode());
        categorieProduitDto.setLibelle(categorieProduit.getLibelle());
        return categorieProduitDto;
    }

    public List<CategorieProduit> toBean(List<CategorieProduitDto> dtos) {
        return dtos.stream().map(e -> toBean(e)).collect(Collectors.toList());
    }

    public List<CategorieProduitDto> toDto(List<CategorieProduit> beans) {
        return beans.stream().map(e -> toDto(e)).collect(Collectors.toList());
    }
}
