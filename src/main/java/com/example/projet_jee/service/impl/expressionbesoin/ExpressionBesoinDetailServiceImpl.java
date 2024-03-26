package com.example.projet_jee.service.impl.expressionbesoin;

import com.example.projet_jee.beans.expressionbesoin.ExpressionBesoinDetail;
import com.example.projet_jee.dao.expressionbesoin.ExpressionBesoinDetailDao;
import com.example.projet_jee.service.facade.expressionbesoin.ExpressionBesoinDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ExpressionBesoinDetailServiceImpl implements ExpressionBesoinDetailService {

    @Autowired
    private ExpressionBesoinDetailDao expressionBesoinDetailDao;

    @Override
    public List<ExpressionBesoinDetail> findByProduitCode(String code) {
        return expressionBesoinDetailDao.findByProduitCode(code);
    }

    @Override
    @Transactional
    public int deleteByProduitCode(String code) {
        return expressionBesoinDetailDao.deleteByProduitCode(code);
    }

    @Override
    public List<ExpressionBesoinDetail> findAll() {
        return expressionBesoinDetailDao.findAll();
    }

    @Override
    public int save(ExpressionBesoinDetail expressionBesoinDetail) {
        expressionBesoinDetailDao.save(expressionBesoinDetail);
        return 1;
    }
}
