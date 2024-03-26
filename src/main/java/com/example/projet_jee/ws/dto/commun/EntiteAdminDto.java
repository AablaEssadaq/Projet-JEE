package com.example.projet_jee.ws.dto.commun;

import com.example.projet_jee.beans.commun.Employe;

public class EntiteAdminDto {
    private long id;
    private String libelle;
    private String code;
    private Employe chef;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getlibelle() {
        return libelle;
    }

    public void setlibelle(String libelle) {
        libelle = libelle;
    }

    public Employe getchef() {
        return chef;
    }

    public void setchef(Employe chef) {
        chef = chef;
    }
}

