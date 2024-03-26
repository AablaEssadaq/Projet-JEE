package com.example.projet_jee.service.impl.achat;

import com.example.projet_jee.beans.achat.AchatMateriel;
import com.example.projet_jee.dao.achat.AchatMaterielDao;
import com.example.projet_jee.service.facade.achat.AchatMaterielService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class AchatMaterielServiceImpl implements AchatMaterielService{

    @Autowired
    private AchatMaterielDao achatMaterielDao;


    @Override
    @Transactional
    public int deleteByDateAchat(LocalDateTime dateAchat) {
        return achatMaterielDao.deleteByDateAchat(dateAchat);
    }

    @Override
    public List<AchatMateriel> findByDateAchat(LocalDateTime dateAchat) {
        return achatMaterielDao.findByDateAchat(dateAchat);
    }

    @Override
    public int save(AchatMateriel a) {
         achatMaterielDao.save(a);
         return 1;
    }


    @Override
    public List<AchatMateriel> findAll() {
        return achatMaterielDao.findAll();
    }
}
