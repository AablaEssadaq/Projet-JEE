package com.example.projet_jee.ws.dto.achat;

import com.example.projet_jee.beans.achat.AchatMateriel;
import com.example.projet_jee.beans.commun.Produit;

public class AchatMaterielDetailDto {
    private long id;
    private Produit produit;
    private double qteAchetee;
    private double qteRecue;
    private double qteLivree;

    private AchatMateriel achatMeteriel;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Produit getProduit() {
        return produit;
    }

    public void setProduit(Produit produit) {
        this.produit = produit;
    }

    public double getQteAchetee() {
        return qteAchetee;
    }

    public void setQteAchetee(double qteAchetee) {
        this.qteAchetee = qteAchetee;
    }

    public double getQteRecue() {
        return qteRecue;
    }

    public void setQteRecue(double qteRecue) {
        this.qteRecue = qteRecue;
    }

    public double getQteLivree() {
        return qteLivree;
    }

    public void setQteLivree(double qteLivree) {
        this.qteLivree = qteLivree;
    }

    public AchatMateriel getAchatMeteriel() {
        return achatMeteriel;
    }

    public void setAchatMeteriel(AchatMateriel achatMeteriel) {
        this.achatMeteriel = achatMeteriel;
    }
}
