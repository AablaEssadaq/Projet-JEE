package com.example.projet_jee.dao.achat;

import com.example.projet_jee.beans.achat.AchatMateriel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;
import java.util.List;

@Repository
@Transactional
public interface AchatMaterielDao extends JpaRepository<AchatMateriel, Long> {



    int deleteByDateAchat(LocalDateTime dateAchat);
    List<AchatMateriel> findByDateAchat(LocalDateTime dateAchat);


}