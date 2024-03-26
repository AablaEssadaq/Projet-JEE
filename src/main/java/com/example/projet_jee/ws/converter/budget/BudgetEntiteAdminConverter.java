package com.example.projet_jee.ws.converter.budget;

import com.example.projet_jee.beans.budget.BudgetEntiteAdmin;
import com.example.projet_jee.ws.dto.budget.BudgetEntiteAdminDto;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class BudgetEntiteAdminConverter {

    public BudgetEntiteAdmin toBean(BudgetEntiteAdminDto budgetEntiteAdminDto){
        BudgetEntiteAdmin budgetEntiteAdmin = new BudgetEntiteAdmin();
        budgetEntiteAdmin.setId(budgetEntiteAdminDto.getId());
        budgetEntiteAdmin.setEntiteAdmin(budgetEntiteAdminDto.getEntiteAdmin());
        budgetEntiteAdmin.setBudget(budgetEntiteAdminDto.getBudget());
        budgetEntiteAdmin.setMontantEntite(budgetEntiteAdminDto.getMontantEntite());
        budgetEntiteAdmin.setMontantFctEntite(budgetEntiteAdminDto.getMontantFctEntite());
        budgetEntiteAdmin.setMontantInvEntite(budgetEntiteAdminDto.getMontantInvEntite());
        return budgetEntiteAdmin;
    }

    public BudgetEntiteAdminDto toDto(BudgetEntiteAdmin budgetEntiteAdmin){
        BudgetEntiteAdminDto budgetEntiteAdminDto = new BudgetEntiteAdminDto();
        budgetEntiteAdminDto.setId(budgetEntiteAdmin.getId());
        budgetEntiteAdminDto.setEntiteAdmin(budgetEntiteAdmin.getEntiteAdmin());
        budgetEntiteAdminDto.setBudget(budgetEntiteAdmin.getBudget());
        budgetEntiteAdminDto.setMontantEntite(budgetEntiteAdmin.getMontantEntite());
        budgetEntiteAdminDto.setMontantFctEntite(budgetEntiteAdmin.getMontantFctEntite());
        budgetEntiteAdminDto.setMontantInvEntite(budgetEntiteAdmin.getMontantInvEntite());
        return budgetEntiteAdminDto;
    }

    public List<BudgetEntiteAdmin> toBean(List<BudgetEntiteAdminDto> dtos) {
        return dtos.stream().map(e -> toBean(e)).collect(Collectors.toList());
    }
    public List<BudgetEntiteAdminDto> toDto(List<BudgetEntiteAdmin> beans) {
        return beans.stream().map(e -> toDto(e)).collect(Collectors.toList());
    }
}
