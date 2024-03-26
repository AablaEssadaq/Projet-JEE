package com.example.projet_jee.service.facade.commun;

import com.example.projet_jee.beans.commun.Produit;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ProduitService{

    Produit findByCode(String code);

    int deleteByCode(String code);

    List<Produit> findAll();

    List<Produit> findByCategorieProduitCode(String code);

    int deleteByCategorieProduitCode(String code);

    int save(Produit p);
}
