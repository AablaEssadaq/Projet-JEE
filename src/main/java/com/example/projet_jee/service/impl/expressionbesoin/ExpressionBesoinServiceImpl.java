package com.example.projet_jee.service.impl.expressionbesoin;

import com.example.projet_jee.beans.commun.Employe;
import com.example.projet_jee.beans.expressionbesoin.ExpressionBesoin;
import com.example.projet_jee.dao.expressionbesoin.ExpressionBesoinDao;
import com.example.projet_jee.service.facade.expressionbesoin.ExpressionBesoinService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDate;
import java.util.List;

@Service
public class ExpressionBesoinServiceImpl implements ExpressionBesoinService {

    @Autowired
    private ExpressionBesoinDao expressionBesoinDao;


    @Override
    public List<ExpressionBesoin> findByDateExpression(LocalDate dateExpression) {
        return expressionBesoinDao.findByDateExpression(dateExpression);
    }

    @Override
    @Transactional
    public int deleteByDateExpression(LocalDate dateExpression) {
        return expressionBesoinDao.deleteByDateExpression(dateExpression);
    }

    @Override
    public List<ExpressionBesoin> findByEmploye(Employe employe) {
        return expressionBesoinDao.findByEmploye(employe);
    }

    @Override
    @Transactional
    public int deleteByEmploye(Employe employe) {
        return expressionBesoinDao.deleteByEmploye(employe);
    }

    @Override
    public List<ExpressionBesoin> findByEntiteAdminCode(String code) {
        return expressionBesoinDao.findByEntiteAdminCode(code);
    }

    @Override
    public int save(ExpressionBesoin expressionBesoin) {
        expressionBesoinDao.save(expressionBesoin);
        return 1;
    }
}
