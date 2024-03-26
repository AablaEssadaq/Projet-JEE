package com.example.projet_jee.dao.budget;

import com.example.projet_jee.beans.budget.Budget;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface BudgetDao extends JpaRepository<Budget, Long> {

    List<Budget> findByDateBudget(LocalDate dateBudget);
    int deleteByDateBudget(LocalDate dateBudget);
    List<Budget> findByDMontant(double montant);// ila 9alabti 3la monatant momkin y retourner lek liste dyal les budget
    int deleteByMontant(double montant);
}
