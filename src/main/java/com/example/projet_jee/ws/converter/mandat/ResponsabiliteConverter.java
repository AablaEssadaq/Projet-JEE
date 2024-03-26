package com.example.projet_jee.ws.converter.mandat;

import com.example.projet_jee.beans.mandat.Responsabilite;
import com.example.projet_jee.ws.dto.mandat.ResponsabiliteDto;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class ResponsabiliteConverter {

    public Responsabilite toBean(ResponsabiliteDto responsabiliteDto){
        Responsabilite responsabilite = new Responsabilite();
        responsabilite.setId(responsabiliteDto.getId());
        responsabilite.setCode(responsabiliteDto.getCode());
        responsabilite.setLibelle(responsabiliteDto.getLibelle());
        return responsabilite;
    }

    public ResponsabiliteDto toDto(Responsabilite responsabilite){
        ResponsabiliteDto responsabiliteDto = new ResponsabiliteDto();
        responsabiliteDto.setId(responsabilite.getId());
        responsabiliteDto.setCode(responsabilite.getCode());
        responsabiliteDto.setLibelle(responsabilite.getLibelle());
        return responsabiliteDto;
    }

    public List<Responsabilite> toBean(List<ResponsabiliteDto> dtos) {
        return dtos.stream().map(e -> toBean(e)).collect(Collectors.toList());
    }

    public List<ResponsabiliteDto> toDto(List<Responsabilite> beans) {
        return beans.stream().map(e -> toDto(e)).collect(Collectors.toList());
    }
}
