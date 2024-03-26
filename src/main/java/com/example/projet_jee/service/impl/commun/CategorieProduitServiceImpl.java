package com.example.projet_jee.service.impl.commun;

import com.example.projet_jee.beans.commun.CategorieProduit;
import com.example.projet_jee.dao.commun.CategorieProduitDao;
import com.example.projet_jee.service.facade.commun.CategorieProduitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class CategorieProduitServiceImpl implements CategorieProduitService {

   @Autowired
   private CategorieProduitDao categorieProduitDao;

    @Override
    public CategorieProduit findByCode(String code) {
        return categorieProduitDao.findByCode(code);
    }

    @Override
    @Transactional
    public int deleteByCode(String code) {
        return categorieProduitDao.deleteByCode(code);
    }

    @Override
    public List<CategorieProduit> findAll() {
        return categorieProduitDao.findAll();
    }

    @Override
    public int save(CategorieProduit categorieProduit) {
        categorieProduitDao.save(categorieProduit);
        return 1;
    }
}
