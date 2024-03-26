package com.example.projet_jee.ws.facade.achat;

import com.example.projet_jee.beans.achat.TypeAchatMateriel;
import com.example.projet_jee.service.facade.achat.TypeAchatMaterielService;
import com.example.projet_jee.ws.converter.achat.TypeAchatMaterielConverter;
import com.example.projet_jee.ws.dto.achat.TypeAchatMaterielDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/typeAchatMateriel")
public class TypeAchatMaterielWS {

    @Autowired
    private TypeAchatMaterielService typeAchatMaterielService;
    @Autowired
    private TypeAchatMaterielConverter typeAchatMaterielConverter;


    @GetMapping("/code/{code}")
    public TypeAchatMaterielDto findByCode(@PathVariable String code) {
        TypeAchatMateriel t = typeAchatMaterielService.findByCode(code);
        return typeAchatMaterielConverter.toDto(t);
    }

    @DeleteMapping("/code/{code}")
    public int deleteByCode(@PathVariable String code) {
        return typeAchatMaterielService.deleteByCode(code);
    }

    @GetMapping("/")
    public List<TypeAchatMaterielDto> findAll() {
        List<TypeAchatMateriel> list = typeAchatMaterielService.findAll();
        return typeAchatMaterielConverter.toDto(list);
    }

    @PostMapping("/")
    public int save(@RequestBody TypeAchatMaterielDto type) {
        TypeAchatMateriel t = typeAchatMaterielConverter.toBean(type);
        return typeAchatMaterielService.save(t);
    }
}
