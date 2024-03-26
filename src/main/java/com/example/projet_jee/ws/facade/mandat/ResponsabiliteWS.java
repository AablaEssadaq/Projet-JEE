package com.example.projet_jee.ws.facade.mandat;

import com.example.projet_jee.beans.mandat.Responsabilite;
import com.example.projet_jee.service.facade.mandat.ResponsabiliteService;
import com.example.projet_jee.ws.converter.mandat.ResponsabiliteConverter;
import com.example.projet_jee.ws.dto.mandat.ResponsabiliteDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/responsabilite")
public class ResponsabiliteWS {

    @Autowired
    private ResponsabiliteService responsabiliteService;
    @Autowired
    private ResponsabiliteConverter converter;

    @GetMapping("/code/{code}")
    public ResponsabiliteDto findByCode(@PathVariable String code) {
        Responsabilite res = responsabiliteService.findByCode(code);
        return converter.toDto(res);
    }

    @DeleteMapping("/code/{code}")
    public int deleteByCode(@PathVariable String code) {
        return responsabiliteService.deleteByCode(code);
    }

    @GetMapping("/")
    public List<ResponsabiliteDto> findAll() {
        List<Responsabilite> list = responsabiliteService.findAll();
        return converter.toDto(list);
    }

    @PostMapping("/")
    public int save(ResponsabiliteDto responsabiliteDto) {
        Responsabilite res = converter.toBean(responsabiliteDto);
        return responsabiliteService.save(res);
    }
}
