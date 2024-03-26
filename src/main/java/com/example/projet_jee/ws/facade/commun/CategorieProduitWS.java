package com.example.projet_jee.ws.facade.commun;

import com.example.projet_jee.beans.commun.CategorieProduit;
import com.example.projet_jee.service.facade.commun.CategorieProduitService;
import com.example.projet_jee.ws.converter.commun.CategorieProduitConverter;
import com.example.projet_jee.ws.dto.commun.CategorieProduitDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/categorieProduit")
public class CategorieProduitWS {

    @Autowired
    private CategorieProduitService categorieProduitService;
    @Autowired
    private CategorieProduitConverter converter;

    @GetMapping("/code/{code}")
    public CategorieProduitDto findByCode(@PathVariable String code) {
        CategorieProduit c = categorieProduitService.findByCode(code);
        return converter.toDto(c);
    }

    @DeleteMapping("/code/{code}")
    public int deleteByCode(@PathVariable String code) {
        return categorieProduitService.deleteByCode(code);
    }

    @GetMapping("/")
    public List<CategorieProduitDto> findAll() {
        List<CategorieProduit> list = categorieProduitService.findAll();
        return converter.toDto(list);
    }

    @PostMapping("/")
    public int save(CategorieProduitDto categorieProduit) {
        CategorieProduit cat = converter.toBean(categorieProduit);
        return categorieProduitService.save(cat);
    }
}
