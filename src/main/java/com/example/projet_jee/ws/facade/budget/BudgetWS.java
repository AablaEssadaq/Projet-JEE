package com.example.projet_jee.ws.facade.budget;

import com.example.projet_jee.beans.budget.Budget;
import com.example.projet_jee.service.facade.budget.BudgetService;
import com.example.projet_jee.ws.converter.budget.BudgetConverter;
import com.example.projet_jee.ws.dto.budget.BudgetDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("api/budget")
public class BudgetWS {

    @Autowired
    private BudgetService budgetService;
    @Autowired
    private BudgetConverter budgetConverter;

    @GetMapping("/dateBudget/{dateBudget}")
    public List<BudgetDto> findByDateBudget(@PathVariable LocalDate dateBudget) {
        List<Budget> budgets = budgetService.findByDateBudget(dateBudget);
        return budgetConverter.toDto(budgets);
    }

    @DeleteMapping("/dateBudget/{dateBudget}")
    public int deleteByDateBudget(@PathVariable LocalDate dateBudget) {
        return budgetService.deleteByDateBudget(dateBudget);
    }

    @GetMapping("/montant/{montant}")
    public List<BudgetDto> findByDMontant(@PathVariable double montant) {
        List<Budget> budgets = budgetService.findByDMontant(montant);
        return budgetConverter.toDto(budgets);
    }

    @DeleteMapping("/montant/{montant}")
    public int deleteByMontant(@PathVariable double montant) {
        return budgetService.deleteByMontant(montant);
    }

    @GetMapping("/")
    public List<BudgetDto> findAll() {
        List<Budget> budgets = budgetService.findAll();
        return budgetConverter.toDto(budgets);
    }

    @PostMapping("/")
    public int save(@RequestBody BudgetDto budgetDto) {
        Budget b = budgetConverter.toBean(budgetDto);
        return budgetService.save(b);
    }
}
