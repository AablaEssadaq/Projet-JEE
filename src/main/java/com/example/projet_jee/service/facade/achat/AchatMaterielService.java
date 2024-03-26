package com.example.projet_jee.service.facade.achat;

import com.example.projet_jee.beans.achat.AchatMateriel;

import java.time.LocalDateTime;
import java.util.List;

public interface AchatMaterielService {
    int deleteByDateAchat(LocalDateTime dateAchat);
    List<AchatMateriel> findByDateAchat(LocalDateTime dateAchat);
    int save(AchatMateriel a);
    //int update(AchatMateriel a);
    List<AchatMateriel> findAll();
}
