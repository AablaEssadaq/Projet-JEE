package com.example.projet_jee.service.facade.budget;


import com.example.projet_jee.beans.budget.Budget;

import java.time.LocalDate;
import java.util.List;

public interface BudgetService {
    List<Budget> findByDateBudget(LocalDate dateBudget);

    int deleteByDateBudget(LocalDate dateBudget);

    List<Budget> findByDMontant(double montant);

    int deleteByMontant(double montant);

    List<Budget> findAll();

    int save(Budget budget);
}
