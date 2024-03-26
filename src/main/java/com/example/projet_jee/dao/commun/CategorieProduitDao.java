package com.example.projet_jee.dao.commun;

import com.example.projet_jee.beans.commun.CategorieProduit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategorieProduitDao extends JpaRepository<CategorieProduit,Long> {
    CategorieProduit findByCode(String code);
    int deleteByCode(String code);
}
