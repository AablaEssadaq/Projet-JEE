package com.example.projet_jee.service.impl.budget;

import com.example.projet_jee.beans.budget.BudgetEntiteAdmin;
import com.example.projet_jee.dao.budget.BudgetEntiteAdminDao;
import com.example.projet_jee.service.facade.budget.BudgetEntiteAdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class BudgetEntiteAdminServiceImpl implements BudgetEntiteAdminService{

    @Autowired
    private BudgetEntiteAdminDao budgetEntiteAdminDao;

    @Override
    public List<BudgetEntiteAdmin> findByBudgetMontant(double montant) {
        return budgetEntiteAdminDao.findByBudgetMontant(montant);
    }

    @Override
    @Transactional
    public int deleteByBudgetMontant(double montant) {
        return budgetEntiteAdminDao.deleteByBudgetMontant(montant);
    }

    @Override
    public List<BudgetEntiteAdmin> findByMontantEntite(double montantEntite) {
        return budgetEntiteAdminDao.findByMontantEntite(montantEntite);
    }

    @Override
    @Transactional
    public int deleteByMontantEntite(double montantEntite) {
        return budgetEntiteAdminDao.deleteByMontantEntite(montantEntite);
    }

    @Override
    public List<BudgetEntiteAdmin> findAll() {
        return budgetEntiteAdminDao.findAll();
    }

    @Override
    public int save(BudgetEntiteAdmin budgetEntiteAdmin) {
        budgetEntiteAdminDao.save(budgetEntiteAdmin);
        return 1;
    }
}
