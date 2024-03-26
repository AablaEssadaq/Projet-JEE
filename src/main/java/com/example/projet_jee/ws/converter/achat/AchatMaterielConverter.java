package com.example.projet_jee.ws.converter.achat;

import com.example.projet_jee.beans.achat.AchatMateriel;
import com.example.projet_jee.ws.dto.achat.AchatMaterielDto;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class AchatMaterielConverter {

    public AchatMateriel toBean(AchatMaterielDto materielDto){
        AchatMateriel achatMateriel = new AchatMateriel();
        achatMateriel.setId(materielDto.getId());
        achatMateriel.setDateAchat(materielDto.getDateAchat());
        achatMateriel.setTypeAchatMateriel(materielDto.getTypeAchatMateriel());
        achatMateriel.setBudget(materielDto.getBudget());
        achatMateriel.setMontantTotal(materielDto.getMontantTotal());
        return achatMateriel;
    }

    public AchatMaterielDto toDto(AchatMateriel achatMateriel){
        AchatMaterielDto materielDto = new AchatMaterielDto();
        materielDto.setId(achatMateriel.getId());
        materielDto.setBudget(achatMateriel.getBudget());
        materielDto.setDateAchat(materielDto.getDateAchat());
        materielDto.setTypeAchatMateriel(achatMateriel.getTypeAchatMateriel());
        materielDto.setMontantTotal(achatMateriel.getMontantTotal());
        return materielDto;
    }

    public List<AchatMateriel> toBean(List<AchatMaterielDto> dtos) {
        return dtos.stream().map(e -> toBean(e)).collect(Collectors.toList());
    }
    public List<AchatMaterielDto> toDto(List<AchatMateriel> beans) {
        return beans.stream().map(e -> toDto(e)).collect(Collectors.toList());
    }
}
