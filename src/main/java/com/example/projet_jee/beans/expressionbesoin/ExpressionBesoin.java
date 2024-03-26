package com.example.projet_jee.beans.expressionbesoin;

import com.example.projet_jee.beans.commun.Employe;
import com.example.projet_jee.beans.commun.EntiteAdmin;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

import java.time.LocalDate;

@Entity
public class ExpressionBesoin {

    @Id
    private long id;
    @ManyToOne
    private Employe employe;
    @ManyToOne
    private EntiteAdmin entiteAdmin;
    private LocalDate dateExpression;
    private String description;

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

    public EntiteAdmin getEntiteAdmin() {
        return entiteAdmin;
    }

    public void setEntiteAdmin(EntiteAdmin entiteAdmin) {
        this.entiteAdmin = entiteAdmin;
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
