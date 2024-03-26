package com.example.projet_jee.service.facade.budget;

import com.example.projet_jee.beans.budget.BudgetEntiteAdmin;

import java.util.List;

public interface BudgetEntiteAdminService {
    List<BudgetEntiteAdmin> findByBudgetMontant(double montant);

    int deleteByBudgetMontant(double montant);

    List<BudgetEntiteAdmin> findByMontantEntite(double montantEntite);

    int deleteByMontantEntite(double montantEntite);

    List<BudgetEntiteAdmin> findAll();

    int save(BudgetEntiteAdmin budgetEntiteAdmin);
}
