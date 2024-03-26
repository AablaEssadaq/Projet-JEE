package com.example.projet_jee.ws.converter.achat;

import com.example.projet_jee.beans.achat.TypeAchatMateriel;
import com.example.projet_jee.ws.dto.achat.TypeAchatMaterielDto;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class TypeAchatMaterielConverter {
    public TypeAchatMateriel toBean(TypeAchatMaterielDto typeAchatMaterielDto){
        TypeAchatMateriel typeAchatMateriel = new TypeAchatMateriel();
        typeAchatMateriel.setId(typeAchatMaterielDto.getId());
        typeAchatMateriel.setCode(typeAchatMaterielDto.getCode());
        typeAchatMateriel.setLibelle(typeAchatMaterielDto.getLibelle());
        return typeAchatMateriel;
    }


    public TypeAchatMaterielDto toDto(TypeAchatMateriel typeAchatMateriel){
        TypeAchatMaterielDto typeAchatMaterielDto = new TypeAchatMaterielDto();
        typeAchatMaterielDto.setId(typeAchatMateriel.getId());
        typeAchatMaterielDto.setCode(typeAchatMateriel.getCode());
        typeAchatMaterielDto.setLibelle(typeAchatMateriel.getLibelle());
        return typeAchatMaterielDto;
    }

    public List<TypeAchatMateriel> toBean(List<TypeAchatMaterielDto> dtos) {
        return dtos.stream().map(e -> toBean(e)).collect(Collectors.toList());
    }

    public List<TypeAchatMaterielDto> toDto(List<TypeAchatMateriel> beans){
        return beans.stream().map(e->toDto(e)).collect(Collectors.toList());
    }

}
