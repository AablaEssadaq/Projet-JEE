package com.example.projet_jee.ws.facade.commun;

import com.example.projet_jee.beans.commun.EntiteAdmin;
import com.example.projet_jee.service.facade.commun.EntiteAdminService;
import com.example.projet_jee.ws.converter.commun.EntiteAdminConverter;
import com.example.projet_jee.ws.dto.commun.EntiteAdminDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/entiteAdmin")
public class EntiteAdminWS {

    @Autowired
    private EntiteAdminService entiteAdminService;
    @Autowired
    private EntiteAdminConverter entiteAdminConverter;

    @GetMapping("/code/{code}")
    public EntiteAdminDto findByCode(@PathVariable String code) {
        EntiteAdmin e = entiteAdminService.findByCode(code);
        return entiteAdminConverter.toDto(e);
    }

    @DeleteMapping("/code/{code}")
    public int deleteByCode(@PathVariable String code) {
        return entiteAdminService.deleteByCode(code);
    }

    @GetMapping("/")
    public List<EntiteAdminDto> findAll() {
        List<EntiteAdmin> list = entiteAdminService.findAll();
        return entiteAdminConverter.toDto(list);
    }

    @PostMapping("/")
    public int save(@RequestBody EntiteAdminDto entiteAdminDto) {
        EntiteAdmin e = entiteAdminConverter.toBean(entiteAdminDto);
        return entiteAdminService.save(e);
    }
}
