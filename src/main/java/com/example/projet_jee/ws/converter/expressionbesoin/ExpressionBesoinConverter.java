package com.example.projet_jee.ws.converter.expressionbesoin;

import com.example.projet_jee.beans.expressionbesoin.ExpressionBesoin;
import com.example.projet_jee.ws.dto.expressionbesoin.ExpressionBesoinDto;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class ExpressionBesoinConverter {

    public ExpressionBesoin toBean(ExpressionBesoinDto expressionBesoinDto) {
        ExpressionBesoin expressionBesoin = new ExpressionBesoin();
        expressionBesoin.setId(expressionBesoinDto.getId());
        expressionBesoin.setDateExpression(expressionBesoinDto.getDateExpression());
        expressionBesoin.setDescription(expressionBesoinDto.getDescription());
        expressionBesoin.setEmploye(expressionBesoinDto.getEmploye());
        expressionBesoin.setEntiteAdmin(expressionBesoinDto.getEntiteAdmin());
        return expressionBesoin;
    }


    public ExpressionBesoinDto toDto(ExpressionBesoin expressionBesoin) {
        ExpressionBesoinDto expressionBesoinDto = new ExpressionBesoinDto();
        expressionBesoinDto.setId(expressionBesoin.getId());
        expressionBesoinDto.setDateExpression(expressionBesoin.getDateExpression());
        expressionBesoinDto.setDescription(expressionBesoin.getDescription());
        expressionBesoinDto.setEmploye(expressionBesoin.getEmploye());
        expressionBesoinDto.setEntiteAdmin(expressionBesoin.getEntiteAdmin());
        return expressionBesoinDto;
    }

    public List<ExpressionBesoin> toBean(List<ExpressionBesoinDto> dtos) {
        return dtos.stream().map(e -> toBean(e)).collect(Collectors.toList());
    }

    public List<ExpressionBesoinDto> toDto(List<ExpressionBesoin> beans) {
        return beans.stream().map(e -> toDto(e)).collect(Collectors.toList());
    }

}
