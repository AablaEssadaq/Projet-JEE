package com.example.projet_jee.service.facade.achat;

import com.example.projet_jee.beans.achat.TypeAchatMateriel;

import java.util.List;

public interface TypeAchatMaterielService {
    TypeAchatMateriel findByCode(String code);
    int deleteByCode(String code);
    List<TypeAchatMateriel> findAll();
    int save(TypeAchatMateriel type);
    TypeAchatMateriel update(TypeAchatMateriel typeAchatMateriel);

}
