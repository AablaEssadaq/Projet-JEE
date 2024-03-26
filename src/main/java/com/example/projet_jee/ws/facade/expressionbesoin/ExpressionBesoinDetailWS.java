package com.example.projet_jee.ws.facade.expressionbesoin;

import com.example.projet_jee.beans.expressionbesoin.ExpressionBesoinDetail;
import com.example.projet_jee.service.facade.expressionbesoin.ExpressionBesoinDetailService;
import com.example.projet_jee.ws.converter.expressionbesoin.ExpressionBesoinDetailConverter;
import com.example.projet_jee.ws.dto.expressionbesoin.ExpressionBesoinDetailDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/expressionBesoinDetail")
public class ExpressionBesoinDetailWS {

    @Autowired
    private ExpressionBesoinDetailService besoinDetailService;
    @Autowired
    private ExpressionBesoinDetailConverter besoinDetailConverter;

    @GetMapping("/code/{code}")
    public List<ExpressionBesoinDetailDto> findByProduitCode(@PathVariable String code) {
        List<ExpressionBesoinDetail> list = besoinDetailService.findByProduitCode(code);
        return besoinDetailConverter.toDto(list);
    }

    @DeleteMapping("/code/{code}")
    public int deleteByProduitCode(@PathVariable String code) {
        return besoinDetailService.deleteByProduitCode(code);
    }

    @GetMapping("/")
    public List<ExpressionBesoinDetailDto> findAll() {
        List<ExpressionBesoinDetail> list = besoinDetailService.findAll();
        return besoinDetailConverter.toDto(list);
    }

    @PostMapping("/")
    public int save(ExpressionBesoinDetailDto expressionBesoinDetailDto) {
        ExpressionBesoinDetail expressionBesoinDetail = besoinDetailConverter.toBean(expressionBesoinDetailDto);
        return besoinDetailService.save(expressionBesoinDetail);
    }
}
