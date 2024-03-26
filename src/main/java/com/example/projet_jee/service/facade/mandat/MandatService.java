package com.example.projet_jee.service.facade.mandat;

import com.example.projet_jee.beans.commun.Employe;
import com.example.projet_jee.beans.mandat.Mandat;

import java.util.List;

public interface MandatService {
    List<Mandat> findByResponsabiliteCode(String code);

    int deleteByResponsabiliteCode(String code);

    List<Mandat> findByEmploye(Employe employe);

    int deleteByEmploye(Employe employe);

    List<Mandat> findByEntiteAdminCode(String code);

    int deleteByEntiteAdminCode(String code);

    List<Mandat> findAll();

    int save(Mandat mandat);
}
