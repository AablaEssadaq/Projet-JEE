package com.example.projet_jee.ws.dto.expressionbesoin;

import com.example.projet_jee.beans.commun.Produit;
import com.example.projet_jee.beans.expressionbesoin.ExpressionBesoin;

public class ExpressionBesoinDetailDto {
    private long id;
    private ExpressionBesoin expressionBesoin;
    private Produit produit;
    private double qteDemandee;
    private double qteAccordee;
    private double qteLivre;


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public ExpressionBesoin getExpressionBesoin() {
        return expressionBesoin;
    }

    public void setExpressionBesoin(ExpressionBesoin expressionBesoin) {
        this.expressionBesoin = expressionBesoin;
    }

    public Produit getProduit() {
        return produit;
    }

    public void setProduit(Produit produit) {
        this.produit = produit;
    }

    public double getQteDemandee() {
        return qteDemandee;
    }

    public void setQteDemandee(double qteDemandee) {
        this.qteDemandee = qteDemandee;
    }

    public double getQteAccordee() {
        return qteAccordee;
    }

    public void setQteAccordee(double qteAccordee) {
        this.qteAccordee = qteAccordee;
    }

    public double getQteLivre() {
        return qteLivre;
    }

    public void setQteLivre(double qteLivre) {
        this.qteLivre = qteLivre;
    }
}

