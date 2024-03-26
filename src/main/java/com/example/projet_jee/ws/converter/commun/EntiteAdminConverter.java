package com.example.projet_jee.ws.converter.commun;

import com.example.projet_jee.beans.commun.EntiteAdmin;
import com.example.projet_jee.ws.dto.commun.EntiteAdminDto;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class EntiteAdminConverter {

    public EntiteAdmin toBean(EntiteAdminDto entiteAdminDto){
        EntiteAdmin entiteAdmin = new EntiteAdmin();
        entiteAdmin.setId(entiteAdminDto.getId());
        entiteAdmin.setCode(entiteAdminDto.getCode());
        entiteAdmin.setLibelle(entiteAdminDto.getlibelle());
        entiteAdmin.setChef(entiteAdminDto.getchef());
        return entiteAdmin;
    }

    public EntiteAdminDto toDto(EntiteAdmin entiteAdmin){
        EntiteAdminDto entiteAdminDto = new EntiteAdminDto();
        entiteAdminDto.setId(entiteAdmin.getId());
        entiteAdminDto.setCode(entiteAdmin.getCode());
        entiteAdminDto.setlibelle(entiteAdmin.getLibelle());
        entiteAdminDto.setchef(entiteAdmin.getChef());
        return entiteAdminDto;
    }

    public List<EntiteAdmin> toBean(List<EntiteAdminDto> dtos) {
        return dtos.stream().map(e -> toBean(e)).collect(Collectors.toList());
    }
    public List<EntiteAdminDto> toDto(List<EntiteAdmin> beans) {
        return beans.stream().map(e -> toDto(e)).collect(Collectors.toList());
    }
}
