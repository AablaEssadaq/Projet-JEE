package com.example.projet_jee.ws.facade.mandat;

import com.example.projet_jee.beans.commun.Employe;
import com.example.projet_jee.beans.mandat.Mandat;
import com.example.projet_jee.service.facade.mandat.MandatService;
import com.example.projet_jee.ws.converter.mandat.MandatConverter;
import com.example.projet_jee.ws.dto.mandat.MandatDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/mandat")
public class MandatWS {


    @Autowired
    private MandatService mandatService;
    @Autowired
    private MandatConverter mandatConverter;

    @GetMapping("/responsabilite/code/{code}")
    public List<MandatDto> findByResponsabiliteCode(@PathVariable String code) {
        List<Mandat> list = mandatService.findByResponsabiliteCode(code);
        return mandatConverter.toDto(list);
    }

    @DeleteMapping("/responsabilite/code/{code}")
    public int deleteByResponsabiliteCode(String code) {
        return mandatService.deleteByResponsabiliteCode(code);
    }

    @GetMapping("/employe/{employe}")
    public List<MandatDto> findByEmploye(@RequestBody Employe employe) {
        List<Mandat> list = mandatService.findByEmploye(employe);
        return mandatConverter.toDto(list);
    }

    @DeleteMapping("/employe/{employe}")
    public int deleteByEmploye(Employe employe) {
        return mandatService.deleteByEmploye(employe);
    }

    @GetMapping("/entiteAdmin/code/{code}")
    public List<MandatDto> findByEntiteAdminCode(@PathVariable String code) {
        List<Mandat> list = mandatService.findByEntiteAdminCode(code);
        return mandatConverter.toDto(list);
    }

    @DeleteMapping("/entiteAdmin/code/{code}")
    public int deleteByEntiteAdminCode(@PathVariable String code) {
        return mandatService.deleteByEntiteAdminCode(code);
    }

    @GetMapping("/")
    public List<MandatDto> findAll() {
        List<Mandat> list = mandatService.findAll();
        return mandatConverter.toDto(list);
    }

    @PostMapping("/")
    public int save(MandatDto mandatDto) {
        Mandat mandat = mandatConverter.toBean(mandatDto);
        return mandatService.save(mandat);
    }
}
