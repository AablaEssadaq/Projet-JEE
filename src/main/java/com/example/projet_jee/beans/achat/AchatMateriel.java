package com.example.projet_jee.beans.achat;

import com.example.projet_jee.beans.budget.Budget;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

import java.time.LocalDateTime;

@Entity
public class AchatMateriel {

    @Id
    private long id;
    @ManyToOne
    private Budget budget;
    private LocalDateTime dateAchat;
    private double montantTotal;
    @ManyToOne
    private TypeAchatMateriel typeAchatMateriel;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Budget getBudget() {
        return budget;
    }

    public void setBudget(Budget budget) {
        this.budget = budget;
    }

    public LocalDateTime getDateAchat() {
        return dateAchat;
    }

    public void setDateAchat(LocalDateTime dateAchat) {
        this.dateAchat = dateAchat;
    }

    public double getMontantTotal() {
        return montantTotal;
    }

    public void setMontantTotal(double montantTotal) {
        this.montantTotal = montantTotal;
    }

    public TypeAchatMateriel getTypeAchatMateriel() {
        return typeAchatMateriel;
    }

    public void setTypeAchatMateriel(TypeAchatMateriel typeAchatMateriel) {
        this.typeAchatMateriel = typeAchatMateriel;
    }
}

