package com.example.projet_jee.dao.mandat;

import com.example.projet_jee.beans.commun.Employe;
import com.example.projet_jee.beans.mandat.Mandat;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import java.util.List;


@Repository
public interface MandatDao extends JpaRepository<Mandat, Long> {
    List<Mandat> findByResponsabiliteCode(String code);
    int deleteByResponsabiliteCode(String code);

    List<Mandat> findByEmploye(Employe employe);
    int deleteByEmploye(Employe employe);

    List<Mandat> findByEntiteAdminCode(String code);
    int deleteByEntiteAdminCode(String code);
}