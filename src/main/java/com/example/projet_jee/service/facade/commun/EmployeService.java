package com.example.projet_jee.service.facade.commun;

import com.example.projet_jee.beans.commun.Employe;
import com.example.projet_jee.beans.commun.EntiteAdmin;

import java.util.List;

public interface EmployeService {

    List<Employe> findByNom(String nom);

    int deleteByNom(String nom);

    List<Employe> findByEntiteAdminCode(String code);

    int deleteByEntiteAdminCode(String code);

    List<Employe> findAll();

    int save(Employe e);

    Employe update(Employe e);
}
