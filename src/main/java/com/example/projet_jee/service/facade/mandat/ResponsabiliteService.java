package com.example.projet_jee.service.facade.mandat;

import com.example.projet_jee.beans.mandat.Responsabilite;

import java.util.List;

public interface ResponsabiliteService {

    Responsabilite findByCode(String code);

    int deleteByCode(String code);

    List<Responsabilite> findAll();

    int save(Responsabilite responsabilite);
}