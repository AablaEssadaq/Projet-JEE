package com.example.projet_jee.service.impl.commun;

import com.example.projet_jee.beans.commun.Produit;
import com.example.projet_jee.dao.commun.ProduitDao;
import com.example.projet_jee.service.facade.commun.ProduitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ProduitServiceImpl implements ProduitService {

    @Autowired
    private ProduitDao produitDao;

    @Override
    public Produit findByCode(String code) {
        return produitDao.findByCode(code);
    }

    @Override
    @Transactional
    public int deleteByCode(String code) {
        return produitDao.deleteByCode(code);
    }

    @Override
    public List<Produit> findAll() {
        return produitDao.findAll();
    }

    @Override
    public List<Produit> findByCategorieProduitCode(String code) {
        return produitDao.findByCategorieProduitCode(code);
    }

    @Override
    @Transactional
    public int deleteByCategorieProduitCode(String code) {
        return produitDao.deleteByCategorieProduitCode(code);
    }

    @Override
    public int save(Produit p) {
        produitDao.save(p);
        return 1;
    }
}
