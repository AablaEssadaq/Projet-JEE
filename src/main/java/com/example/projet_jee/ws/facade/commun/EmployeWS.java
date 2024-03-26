package com.example.projet_jee.ws.facade.commun;

import com.example.projet_jee.beans.commun.Employe;
import com.example.projet_jee.service.facade.commun.EmployeService;
import com.example.projet_jee.ws.converter.commun.EmployeConverter;
import com.example.projet_jee.ws.dto.commun.EmployeDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/employe")

public class EmployeWS {

    @Autowired
    private EmployeService employeService;
    @Autowired
    private EmployeConverter employeConverter;


    @GetMapping("/nom/{nom}")
    public List<EmployeDto> findByNom(@PathVariable String nom) {
        List<Employe> emp = employeService.findByNom(nom);
        return employeConverter.toDto(emp);
    }

    @DeleteMapping("/nom/{nom}")
    public int deleteByNom(@PathVariable String nom) {
        return employeService.deleteByNom(nom);
    }

    @GetMapping("/code/{code}")
    public List<EmployeDto> findByEntiteAdminCode(@PathVariable String code) {
        List<Employe> list = employeService.findByEntiteAdminCode(code);
        return employeConverter.toDto(list);
    }

    @DeleteMapping("/code/{code}")
    public int deleteByEntiteAdminCode(@PathVariable String code) {
        return employeService.deleteByEntiteAdminCode(code);
    }

    @GetMapping("/")
    public List<EmployeDto> findAll() {
        List<Employe> list = employeService.findAll();
        return employeConverter.toDto(list);
    }

    @PostMapping("/")
    public int save(@RequestBody EmployeDto employeDto) {
        Employe e = employeConverter.toBean(employeDto);
        return employeService.save(e);
    }
}
