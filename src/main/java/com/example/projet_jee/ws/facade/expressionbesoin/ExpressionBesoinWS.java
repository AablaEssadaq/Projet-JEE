package com.example.projet_jee.ws.facade.expressionbesoin;

import com.example.projet_jee.beans.commun.Employe;
import com.example.projet_jee.beans.expressionbesoin.ExpressionBesoin;
import com.example.projet_jee.service.facade.expressionbesoin.ExpressionBesoinService;
import com.example.projet_jee.ws.converter.expressionbesoin.ExpressionBesoinConverter;
import com.example.projet_jee.ws.dto.expressionbesoin.ExpressionBesoinDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("api/expressionBesoin")
public class ExpressionBesoinWS {

    @Autowired
    private ExpressionBesoinService besoinService;
    @Autowired
    private ExpressionBesoinConverter besoinConverter;

    @GetMapping("/dateExpression/{dateExpression}")
    public List<ExpressionBesoinDto> findByDateExpression(@PathVariable LocalDate dateExpression) {
        List<ExpressionBesoin> list = besoinService.findByDateExpression(dateExpression);
        return besoinConverter.toDto(list);
    }

    @DeleteMapping("/dateExpression/{dateExpression}")
    public int deleteByDateExpression(@PathVariable LocalDate dateExpression) {
        return besoinService.deleteByDateExpression(dateExpression);
    }

    @GetMapping("/employe/{employe}")
    public List<ExpressionBesoinDto> findByEmploye(@RequestBody Employe employe) {
        List<ExpressionBesoin> list = besoinService.findByEmploye(employe);
        return besoinConverter.toDto(list);
    }

    @DeleteMapping("/employe/{employe}")
    public int deleteByEmploye(Employe employe) {
        return besoinService.deleteByEmploye(employe);
    }

    @GetMapping("/code/{code}")
    public List<ExpressionBesoinDto> findByEntiteAdminCode(@PathVariable String code) {
        List<ExpressionBesoin> list = besoinService.findByEntiteAdminCode(code);
        return besoinConverter.toDto(list);
    }

    @PostMapping("/")
    public int save(ExpressionBesoinDto expressionBesoinDto) {
        ExpressionBesoin expressionBesoin = besoinConverter.toBean(expressionBesoinDto);
        return besoinService.save(expressionBesoin);
    }
}
