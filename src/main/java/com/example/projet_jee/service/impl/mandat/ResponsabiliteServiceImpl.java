package com.example.projet_jee.service.impl.mandat;

import com.example.projet_jee.beans.mandat.Responsabilite;
import com.example.projet_jee.dao.mandat.ResponsabiliteDao;
import com.example.projet_jee.service.facade.mandat.ResponsabiliteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ResponsabiliteServiceImpl implements ResponsabiliteService {

   @Autowired
   private ResponsabiliteDao responsabiliteDao;

    @Override
    public Responsabilite findByCode(String code) {
        return responsabiliteDao.findByCode(code);
    }

    @Override
    @Transactional
    public int deleteByCode(String code) {
        return responsabiliteDao.deleteByCode(code);
    }

    @Override
    public List<Responsabilite> findAll() {
        return responsabiliteDao.findAll();
    }

    @Override
    public int save(Responsabilite responsabilite) {
        responsabiliteDao.save(responsabilite);
        return 0;
    }
}
