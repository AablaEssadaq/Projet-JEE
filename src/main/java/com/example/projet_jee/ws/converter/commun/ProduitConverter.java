package com.example.projet_jee.ws.converter.commun;

import com.example.projet_jee.beans.commun.Produit;
import com.example.projet_jee.ws.dto.commun.ProduitDto;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class ProduitConverter {

    public Produit toBean(ProduitDto produitDto){
        Produit produit = new Produit();
        produit.setId(produitDto.getId());
        produit.setCode(produitDto.getCode());
        produit.setLibelle(produitDto.getLibelle());
        produit.setCategorieProduit(produitDto.getCategorieProduit());
        return produit;
    }


    public ProduitDto toDto(Produit produit){
        ProduitDto produitDto = new ProduitDto();
        produitDto.setId(produit.getId());
        produitDto.setCode(produit.getCode());
        produitDto.setLibelle(produit.getLibelle());
        produitDto.setCategorieProduit(produit.getCategorieProduit());
        return produitDto;
    }

    public List<Produit> toBean(List<ProduitDto> dtos) {
        return dtos.stream().map(e -> toBean(e)).collect(Collectors.toList());
    }

    public List<ProduitDto> toDto(List<Produit> beans) {
        return beans.stream().map(e -> toDto(e)).collect(Collectors.toList());
    }
}
