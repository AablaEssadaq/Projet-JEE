package com.example.projet_jee.dao.expressionbesoin;

import com.example.projet_jee.beans.expressionbesoin.ExpressionBesoinDetail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ExpressionBesoinDetailDao extends JpaRepository<ExpressionBesoinDetail , Long> {
    List<ExpressionBesoinDetail> findByProduitCode(String code);
    int deleteByProduitCode( String code);
}