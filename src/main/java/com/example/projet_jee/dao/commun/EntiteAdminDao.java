package com.example.projet_jee.dao.commun;

import com.example.projet_jee.beans.commun.Employe;
import com.example.projet_jee.beans.commun.EntiteAdmin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EntiteAdminDao extends JpaRepository<EntiteAdmin,Long> {
    EntiteAdmin findByCode(String code);
    int deleteByCode(String code);
    List<EntiteAdmin> findByEmploye(Employe chef);
    int deleteByEmploye(Employe chef);
}

