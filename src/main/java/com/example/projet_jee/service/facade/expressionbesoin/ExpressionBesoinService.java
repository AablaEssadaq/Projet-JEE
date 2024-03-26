package com.example.projet_jee.service.facade.expressionbesoin;

import com.example.projet_jee.beans.commun.Employe;
import com.example.projet_jee.beans.expressionbesoin.ExpressionBesoin;

import java.time.LocalDate;
import java.util.List;

public interface ExpressionBesoinService {
    List<ExpressionBesoin> findByDateExpression(LocalDate dateExpression);

    int deleteByDateExpression(LocalDate dateExpression);

    List<ExpressionBesoin> findByEmploye(Employe employe);

    int deleteByEmploye(Employe employe);

    List<ExpressionBesoin> findByEntiteAdminCode(String code);

    int save(ExpressionBesoin expressionBesoin);
}
