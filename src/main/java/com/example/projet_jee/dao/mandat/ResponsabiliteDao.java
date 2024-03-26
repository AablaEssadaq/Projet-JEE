package com.example.projet_jee.dao.mandat;

import com.example.projet_jee.beans.mandat.Responsabilite;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ResponsabiliteDao extends JpaRepository<Responsabilite, Long> {

    Responsabilite findByCode(String code);

    int deleteByCode(String code);
}