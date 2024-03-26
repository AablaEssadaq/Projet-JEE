package com.example.projet_jee.ws.converter.mandat;

import com.example.projet_jee.beans.mandat.Mandat;
import com.example.projet_jee.ws.dto.mandat.MandatDto;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class MandatConverter {

    public Mandat toBean(MandatDto mandatDto) {
        Mandat mandat = new Mandat();
        mandat.setId(mandatDto.getId());
        mandat.setEmploye(mandatDto.getEmploye());
        mandat.setEntiteAdmin(mandatDto.getEntiteAdmin());
        mandat.setResponsabilite(mandatDto.getResponsabilite());
        mandat.setDateDebut(mandatDto.getDateDebut());
        mandat.setDateFin(mandatDto.getDateFin());
        return mandat;
    }
    public MandatDto toDto(Mandat mandat){
        MandatDto mandatDto = new MandatDto();
        mandatDto.setId(mandat.getId());
        mandatDto.setEmploye(mandat.getEmploye());
        mandatDto.setEntiteAdmin(mandat.getEntiteAdmin());
        mandatDto.setResponsabilite(mandat.getResponsabilite());
        mandatDto.setDateDebut(mandat.getDateDebut());
        mandatDto.setDateFin(mandat.getDateFin());
        return mandatDto;
    }

    public List<Mandat> toBean(List<MandatDto> dtos) {
        return dtos.stream().map(e -> toBean(e)).collect(Collectors.toList());
    }

    public List<MandatDto> toDto(List<Mandat> beans) {
        return beans.stream().map(e -> toDto(e)).collect(Collectors.toList());
    }

}
