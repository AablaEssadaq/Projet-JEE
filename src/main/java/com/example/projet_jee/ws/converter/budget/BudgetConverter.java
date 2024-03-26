package com.example.projet_jee.ws.converter.budget;

import com.example.projet_jee.beans.achat.AchatMateriel;
import com.example.projet_jee.beans.budget.Budget;
import com.example.projet_jee.ws.dto.achat.AchatMaterielDto;
import com.example.projet_jee.ws.dto.budget.BudgetDto;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class BudgetConverter {

    public Budget toBean(BudgetDto budgetDto){
        Budget budget = new Budget();
        budget.setId(budgetDto.getId());
        budget.setDateBudget(budgetDto.getDateBudget());
        budget.setMontant(budgetDto.getMontant());
        budget.setMontantFonction(budgetDto.getMontantFonction());
        budget.setMontantInvestissement(budgetDto.getMontantInvestissement());
        return budget;
    }

    public BudgetDto toDto(Budget budget){
        BudgetDto budgetDto = new BudgetDto();
        budgetDto.setId(budget.getId());
        budgetDto.setDateBudget(budget.getDateBudget());
        budgetDto.setMontant(budget.getMontant());
        budgetDto.setMontantFonction(budget.getMontantFonction());
        budgetDto.setMontantInvestissement(budget.getMontantInvestissement());
        return budgetDto;
    }

    public List<Budget> toBean(List<BudgetDto> dtos) {
        return dtos.stream().map(e -> toBean(e)).collect(Collectors.toList());
    }
    public List<BudgetDto> toDto(List<Budget> beans) {
        return beans.stream().map(e -> toDto(e)).collect(Collectors.toList());
    }
}
