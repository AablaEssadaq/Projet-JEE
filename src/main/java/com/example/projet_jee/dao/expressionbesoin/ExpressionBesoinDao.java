package com.example.projet_jee.dao.expressionbesoin;

import com.example.projet_jee.beans.commun.Employe;
import com.example.projet_jee.beans.expressionbesoin.ExpressionBesoin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface ExpressionBesoinDao extends JpaRepository<ExpressionBesoin, Long> {

    List<ExpressionBesoin> findByDateExpression(LocalDate dateExpression);

    int deleteByDateExpression(LocalDate dateExpression);

    List<ExpressionBesoin> findByEmploye(Employe employe);

    int deleteByEmploye(Employe employe);

    List<ExpressionBesoin> findByEntiteAdminCode(String code);

    int deleteByEntiteAdminCode(String code);


}
