package com.example.projet_jee.ws.dto.commun;

import com.example.projet_jee.beans.commun.CategorieProduit;

public class ProduitDto {
    private long id;
    private String libelle;
    private String code;
    private CategorieProduit categorieProduit;

    public CategorieProduit getCategorieProduit() {
        return categorieProduit;
    }

    public void setCategorieProduit(CategorieProduit categorieProduit) {
        this.categorieProduit = categorieProduit;
    }


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}

