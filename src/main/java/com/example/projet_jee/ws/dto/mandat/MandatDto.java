package com.example.projet_jee.ws.dto.mandat;

import com.example.projet_jee.beans.commun.Employe;
import com.example.projet_jee.beans.commun.EntiteAdmin;
import com.example.projet_jee.beans.mandat.Responsabilite;

import java.time.LocalDate;

public class MandatDto {
    private long id;
    private Employe employe;
    private LocalDate dateDebut;
    private LocalDate dateFin;
    private Responsabilite responsabilite;
    private EntiteAdmin entiteAdmin;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Employe getEmploye() {
        return employe;
    }

    public void setEmploye(Employe employee) {
        this.employe = employee;
    }

    public LocalDate getDateDebut() {
        return dateDebut;
    }

    public void setDateDebut(LocalDate dateDebut) {
        this.dateDebut = dateDebut;
    }

    public LocalDate getDateFin() {
        return dateFin;
    }

    public void setDateFin(LocalDate dateFin) {
        this.dateFin = dateFin;
    }

    public Responsabilite getResponsabilite() {
        return responsabilite;
    }

    public void setResponsabilite(Responsabilite responsabilite) {
        this.responsabilite = responsabilite;
    }

    public EntiteAdmin getEntiteAdmin() {
        return entiteAdmin;
    }

    public void setEntiteAdmin(EntiteAdmin entiteAdmin) {
        this.entiteAdmin = entiteAdmin;
    }
}

