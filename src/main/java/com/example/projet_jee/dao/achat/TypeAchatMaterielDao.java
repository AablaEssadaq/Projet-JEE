package com.example.projet_jee.dao.achat;

import com.example.projet_jee.beans.achat.TypeAchatMateriel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TypeAchatMaterielDao extends JpaRepository<TypeAchatMateriel, Long> {

  TypeAchatMateriel findByCode(String code);
  int deleteByCode(String code);

}
