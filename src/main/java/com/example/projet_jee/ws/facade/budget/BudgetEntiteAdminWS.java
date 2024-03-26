package com.example.projet_jee.ws.facade.budget;

import com.example.projet_jee.beans.budget.BudgetEntiteAdmin;
import com.example.projet_jee.service.facade.budget.BudgetEntiteAdminService;
import com.example.projet_jee.ws.converter.budget.BudgetEntiteAdminConverter;
import com.example.projet_jee.ws.dto.budget.BudgetEntiteAdminDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/budgetEntiteAdmin")
public class BudgetEntiteAdminWS {

    @Autowired
    private BudgetEntiteAdminService budgetEntiteAdminService;
    @Autowired
    private BudgetEntiteAdminConverter budgetEntiteAdminConverter;

    @GetMapping("/montant/{montant}")
    public List<BudgetEntiteAdminDto> findByBudgetMontant(@PathVariable double montant) {
        List<BudgetEntiteAdmin> list = budgetEntiteAdminService.findByBudgetMontant(montant);
        return budgetEntiteAdminConverter.toDto(list);
    }

    @DeleteMapping("/montant/{montant}")
    public int deleteByBudgetMontant(@PathVariable double montant) {
        return budgetEntiteAdminService.deleteByBudgetMontant(montant);
    }

    @GetMapping("/montantEntite/{montantEntite}")
    public List<BudgetEntiteAdminDto> findByMontantEntite(@PathVariable double montantEntite) {
        List<BudgetEntiteAdmin> list = budgetEntiteAdminService.findByMontantEntite(montantEntite);
        return budgetEntiteAdminConverter.toDto(list);
    }

    @DeleteMapping("/montantEntite/{montantEntite}")
    public int deleteByMontantEntite(@PathVariable double montantEntite) {
        return budgetEntiteAdminService.deleteByMontantEntite(montantEntite);
    }

    @GetMapping("/")
    public List<BudgetEntiteAdminDto> findAll() {
        List<BudgetEntiteAdmin> list = budgetEntiteAdminService.findAll();
        return budgetEntiteAdminConverter.toDto(list);
    }

    @PostMapping("/")
    public int save(@RequestBody BudgetEntiteAdminDto budgetEntiteAdminDto) {
        BudgetEntiteAdmin b = budgetEntiteAdminConverter.toBean(budgetEntiteAdminDto);
        return budgetEntiteAdminService.save(b);
    }
}
