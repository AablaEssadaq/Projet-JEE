package com.example.projet_jee.service.impl.commun;

import com.example.projet_jee.beans.commun.EntiteAdmin;
import com.example.projet_jee.dao.commun.EntiteAdminDao;
import com.example.projet_jee.service.facade.commun.EntiteAdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class EntiteAdminServiceImpl implements EntiteAdminService {

    @Autowired
    private EntiteAdminDao entiteAdminDao;


    @Override
    public EntiteAdmin findByCode(String code) {
        return entiteAdminDao.findByCode(code);
    }

    @Override
    @Transactional
    public int deleteByCode(String code) {
        return entiteAdminDao.deleteByCode(code);
    }

    @Override
    public List<EntiteAdmin> findAll() {
        return entiteAdminDao.findAll();
    }

    @Override
    public int save(EntiteAdmin entiteAdmin) {
        entiteAdminDao.save(entiteAdmin);
        return 1;
    }
}
