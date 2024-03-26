package com.example.projet_jee.beans.budget;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.time.LocalDate;

@Entity
public class Budget {

    @Id
    private long id;
    private LocalDate dateBudget;
    private double montant;
    private double montantInvestissement;
    private double montantFonction;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public LocalDate getDateBudget() {
        return dateBudget;
    }

    public void setDateBudget(LocalDate dateBudget) {
        this.dateBudget = dateBudget;
    }

    public double getMontant() {
        return montant;
    }

    public void setMontant(double montant) {
        this.montant = montant;
    }

    public double getMontantInvestissement() {
        return montantInvestissement;
    }

    public void setMontantInvestissement(double montantInvestissement) {
        this.montantInvestissement = montantInvestissement;
    }

    public double getMontantFonction() {
        return montantFonction;
    }

    public void setMontantFonction(double montantFonction) {
        this.montantFonction = montantFonction;
    }
}


