package com.example.projet_jee.dao.budget;

import com.example.projet_jee.beans.budget.BudgetEntiteAdmin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BudgetEntiteAdminDao extends JpaRepository<BudgetEntiteAdmin, Long> {

    List<BudgetEntiteAdmin> findByBudgetMontant(double montant);
    int deleteByBudgetMontant(double montant);

    List<BudgetEntiteAdmin> findByMontantEntite(double montantEntite );
    int deleteByMontantEntite(double montantEntite );

}