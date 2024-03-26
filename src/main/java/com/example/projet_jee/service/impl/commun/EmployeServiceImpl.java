package com.example.projet_jee.service.impl.commun;

import com.example.projet_jee.beans.commun.Employe;
import com.example.projet_jee.dao.commun.EmployeDao;
import com.example.projet_jee.service.facade.commun.EmployeService;
import com.example.projet_jee.service.facade.commun.EntiteAdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeServiceImpl implements EmployeService {

    @Autowired
    private EmployeDao employeDao;
    private EntiteAdminService entiteAdminService;

    @Override
    public List<Employe> findByNom(String nom) {
        return employeDao.findByNom(nom);
    }

    @Override
    @Transactional
    public int deleteByNom(String nom) {
        return employeDao.deleteByNom(nom);
    }

    @Override
    public List<Employe> findByEntiteAdminCode(String code) {
        return employeDao.findByEntiteAdminCode(code);
    }

    @Override
    @Transactional
    public int deleteByEntiteAdminCode(String code) {
        return employeDao.deleteByEntiteAdminCode(code);
    }

    @Override
    public List<Employe> findAll() {
        return employeDao.findAll();
    }

    @Override
    public int save(Employe e) {
        if (e.getEntiteAdmin() != null) {
            String code = e.getEntiteAdmin().getCode();
            e.setEntiteAdmin(entiteAdminService.findByCode(code));
            employeDao.save(e);
            return 1;
        } else return -1;

    }

    public Employe update(Employe e) {
        Optional<Employe> found = employeDao.findById(e.getId());
        if (found == null) return null;
        else {
            update(e);
            return employeDao.save(e);
        }

    }


}

