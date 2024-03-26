package com.example.projet_jee.service.facade.expressionbesoin;


import com.example.projet_jee.beans.expressionbesoin.ExpressionBesoinDetail;

import java.util.List;

public interface ExpressionBesoinDetailService {
    List<ExpressionBesoinDetail> findByProduitCode(String code);

    int deleteByProduitCode(String code);

    List<ExpressionBesoinDetail> findAll();

    int save(ExpressionBesoinDetail expressionBesoinDetail);
}