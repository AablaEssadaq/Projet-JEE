package com.example.projet_jee.service.impl.budget;

import com.example.projet_jee.beans.budget.Budget;
import com.example.projet_jee.dao.budget.BudgetDao;
import com.example.projet_jee.service.facade.budget.BudgetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDate;
import java.util.List;

@Service
public class BudgetServiceImpl implements BudgetService {

    @Autowired
    private BudgetDao budgetDao;
    @Override
    public List<Budget> findByDateBudget(LocalDate dateBudget) {
        return budgetDao.findByDateBudget(dateBudget);
    }

    @Override
    @Transactional
    public int deleteByDateBudget(LocalDate dateBudget) {
        return budgetDao.deleteByDateBudget(dateBudget);
    }

    @Override
    public List<Budget> findByDMontant(double montant) {
        return budgetDao.findByDMontant(montant);
    }

    @Override
    @Transactional
    public int deleteByMontant(double montant) {
        return budgetDao.deleteByMontant(montant);
    }

    @Override
    public List<Budget> findAll() {
        return budgetDao.findAll();
    }

    @Override
    public int save(Budget budget) {
        budgetDao.save(budget);
        return 1;
    }
}
