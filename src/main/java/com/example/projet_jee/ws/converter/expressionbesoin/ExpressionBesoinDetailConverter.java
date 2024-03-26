package com.example.projet_jee.ws.converter.expressionbesoin;

import com.example.projet_jee.beans.expressionbesoin.ExpressionBesoinDetail;
import com.example.projet_jee.ws.dto.expressionbesoin.ExpressionBesoinDetailDto;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class ExpressionBesoinDetailConverter {

    public ExpressionBesoinDetail toBean(ExpressionBesoinDetailDto expressionBesoinDetailDto){
        ExpressionBesoinDetail expressionBesoinDetail = new ExpressionBesoinDetail();
        expressionBesoinDetail.setId(expressionBesoinDetailDto.getId());
        expressionBesoinDetail.setExpressionBesoin(expressionBesoinDetailDto.getExpressionBesoin());
        expressionBesoinDetail.setProduit(expressionBesoinDetailDto.getProduit());
        expressionBesoinDetail.setQteAccordee(expressionBesoinDetailDto.getQteAccordee());
        expressionBesoinDetail.setQteDemandee(expressionBesoinDetailDto.getQteDemandee());
        expressionBesoinDetail.setQteLivre(expressionBesoinDetailDto.getQteLivre());
        return expressionBesoinDetail;
    }


    public ExpressionBesoinDetailDto toDto(ExpressionBesoinDetail expressionBesoinDetail){
        ExpressionBesoinDetailDto expressionBesoinDetailDto = new ExpressionBesoinDetailDto();
        expressionBesoinDetailDto.setId(expressionBesoinDetail.getId());
        expressionBesoinDetailDto.setExpressionBesoin(expressionBesoinDetail.getExpressionBesoin());
        expressionBesoinDetailDto.setProduit(expressionBesoinDetail.getProduit());
        expressionBesoinDetailDto.setQteAccordee(expressionBesoinDetail.getQteAccordee());
        expressionBesoinDetailDto.setQteDemandee(expressionBesoinDetail.getQteDemandee());
        expressionBesoinDetailDto.setQteLivre(expressionBesoinDetail.getQteLivre());
        return expressionBesoinDetailDto;
    }


    public List<ExpressionBesoinDetail> toBean(List<ExpressionBesoinDetailDto> dtos) {
        return dtos.stream().map(e -> toBean(e)).collect(Collectors.toList());
    }

    public List<ExpressionBesoinDetailDto> toDto(List<ExpressionBesoinDetail> beans) {
        return beans.stream().map(e -> toDto(e)).collect(Collectors.toList());
    }
}
