package com.example.projet_jee.dao.commun;

import com.example.projet_jee.beans.commun.Produit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProduitDao extends JpaRepository<Produit,Long> {
    Produit findByCode(String code);
    int deleteByCode(String code);


    List<Produit> findByCategorieProduitCode(String code);
    int deleteByCategorieProduitCode(String code);
}
