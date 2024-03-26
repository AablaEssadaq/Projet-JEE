package com.example.projet_jee.service.impl.mandat;

import com.example.projet_jee.beans.commun.Employe;
import com.example.projet_jee.beans.mandat.Mandat;
import com.example.projet_jee.dao.mandat.MandatDao;
import com.example.projet_jee.service.facade.mandat.MandatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class MandatServiceImpl implements MandatService {

    @Autowired
    private MandatDao mandatDao;
    @Override
    public List<Mandat> findByResponsabiliteCode(String code) {
        return mandatDao.findByResponsabiliteCode(code);
    }

    @Override
    @Transactional
    public int deleteByResponsabiliteCode(String code) {
        return mandatDao.deleteByResponsabiliteCode(code);
    }

    @Override
    public List<Mandat> findByEmploye(Employe employe) {
        return mandatDao.findByEmploye(employe);
    }

    @Override
    @Transactional
    public int deleteByEmploye(Employe employe) {
        return mandatDao.deleteByEmploye(employe);
    }

    @Override
    public List<Mandat> findByEntiteAdminCode(String code) {
        return mandatDao.findByEntiteAdminCode(code);
    }

    @Override
    @Transactional
    public int deleteByEntiteAdminCode(String code) {
        return mandatDao.deleteByEntiteAdminCode(code);
    }

    @Override
    public List<Mandat> findAll() {
        return mandatDao.findAll();
    }

    @Override
    public int save(Mandat mandat) {
        mandatDao.save(mandat);
        return 1;
    }
}
