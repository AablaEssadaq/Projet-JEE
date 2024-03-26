package com.example.projet_jee.service.facade.commun;

import com.example.projet_jee.beans.commun.CategorieProduit;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CategorieProduitService{

    CategorieProduit findByCode(String code);

    int deleteByCode(String code);

    List<CategorieProduit> findAll();

    int save(CategorieProduit categorieProduit);
}