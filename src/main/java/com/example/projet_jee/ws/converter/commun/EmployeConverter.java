package com.example.projet_jee.ws.converter.commun;

import com.example.projet_jee.beans.commun.Employe;
import com.example.projet_jee.ws.dto.commun.EmployeDto;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class EmployeConverter {

    public Employe toBean(EmployeDto employeDto){
        Employe employe = new Employe();
        employe.setId(employeDto.getId());
        employe.setNom(employeDto.getNom());
        employe.setPrenom(employeDto.getPrenom());
        employe.setEntiteAdmin(employeDto.getEntiteAdmin());
        return employe;
    }


    public EmployeDto toDto(Employe employe){
        EmployeDto employeDto = new EmployeDto();
        employeDto.setId(employe.getId());
        employeDto.setNom(employe.getNom());
        employeDto.setPrenom(employe.getPrenom());
        employeDto.setEntiteAdmin(employe.getEntiteAdmin());
        return employeDto;
    }

    public List<Employe> toBean(List<EmployeDto> dtos) {
        return dtos.stream().map(e -> toBean(e)).collect(Collectors.toList());
    }

    public List<EmployeDto> toDto(List<Employe> beans){
        return beans.stream().map(e->toDto(e)).collect(Collectors.toList());
    }

}
