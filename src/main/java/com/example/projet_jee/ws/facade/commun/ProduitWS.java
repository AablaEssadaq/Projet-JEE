package com.example.projet_jee.ws.facade.commun;

import com.example.projet_jee.beans.commun.Produit;
import com.example.projet_jee.service.facade.commun.ProduitService;
import com.example.projet_jee.ws.converter.commun.ProduitConverter;
import com.example.projet_jee.ws.dto.commun.ProduitDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/produit")
public class ProduitWS {

    @Autowired
    private ProduitService produitService;
    @Autowired
    private ProduitConverter produitConverter;

    @GetMapping("/code/{code}")
    public ProduitDto findByCode(@PathVariable String code) {
        Produit produit = produitService.findByCode(code);
        return produitConverter.toDto(produit);
    }

    @DeleteMapping("/code/{code}")
    public int deleteByCode(@PathVariable String code) {
        return produitService.deleteByCode(code);
    }

    @GetMapping("/")
    public List<ProduitDto> findAll() {
        List<Produit> list = produitService.findAll();
        return produitConverter.toDto(list);
    }

    @GetMapping("/catProduit/code/{code}")
    public List<ProduitDto> findByCategorieProduitCode(@PathVariable String code) {
        List<Produit> produits = produitService.findByCategorieProduitCode(code);
        return produitConverter.toDto(produits);
    }

    @DeleteMapping("/catProduit/code/{code}")
    public int deleteByCategorieProduitCode(@PathVariable String code) {
        return produitService.deleteByCategorieProduitCode(code);
    }

    @PostMapping("/")
    public int save(ProduitDto p) {
        Produit produit = produitConverter.toBean(p);
        return produitService.save(produit);
    }
}
