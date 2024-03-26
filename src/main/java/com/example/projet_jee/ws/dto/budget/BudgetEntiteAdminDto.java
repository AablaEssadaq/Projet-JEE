package com.example.projet_jee.ws.dto.budget;

import com.example.projet_jee.beans.budget.Budget;
import com.example.projet_jee.beans.commun.EntiteAdmin;

public class BudgetEntiteAdminDto {
    private long id;
    private EntiteAdmin entiteAdmin;
    private double montantEntite;
    private double montantInvEntite;
    private double montantFctEntite;
    private Budget budget;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public EntiteAdmin getEntiteAdmin() {
        return entiteAdmin;
    }

    public void setEntiteAdmin(EntiteAdmin entiteAdmin) {
        this.entiteAdmin = entiteAdmin;
    }

    public double getMontantEntite() {
        return montantEntite;
    }

    public void setMontantEntite(double montantEntite) {
        this.montantEntite = montantEntite;
    }

    public double getMontantInvEntite() {
        return montantInvEntite;
    }

    public void setMontantInvEntite(double montantInvEntite) {
        this.montantInvEntite = montantInvEntite;
    }

    public double getMontantFctEntite() {
        return montantFctEntite;
    }

    public void setMontantFctEntite(double montantFctEntite) {
        this.montantFctEntite = montantFctEntite;
    }

    public Budget getBudget() {
        return budget;
    }

    public void setBudget(Budget budget) {
        this.budget = budget;
    }
}

