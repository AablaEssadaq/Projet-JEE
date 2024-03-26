package com.example.projet_jee.ws.dto.expressionbesoin;

import com.example.projet_jee.beans.commun.Employe;
import com.example.projet_jee.beans.commun.EntiteAdmin;

import java.time.LocalDate;

public class ExpressionBesoinDto {
    private long id;
    private Employe employe;
    private EntiteAdmin entiteAdmin;
    private LocalDate dateExpression;
    private String description;

    public EntiteAdmin getEntiteAdmin() {
        return entiteAdmin;
    }

    public void setEntiteAdmin(EntiteAdmin entiteAdmin) {
        this.entiteAdmin = entiteAdmin;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Employe getEmploye() {
        return employe;
    }

    public void setEmploye(Employe employe) {
        this.employe = employe;
    }

    public LocalDate getDateExpression() {
        return dateExpression;
    }

    public void setDateExpression(LocalDate dateExpression) {
        this.dateExpression = dateExpression;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}

