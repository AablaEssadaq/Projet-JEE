package com.example.projet_jee.ws.facade.achat;

import com.example.projet_jee.beans.achat.AchatMateriel;
import com.example.projet_jee.service.facade.achat.AchatMaterielService;
import com.example.projet_jee.ws.converter.achat.AchatMaterielConverter;
import com.example.projet_jee.ws.dto.achat.AchatMaterielDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping("api/achatMateriel")
public class AchatMaterielWS {

    @Autowired
    private AchatMaterielService achatMaterielService;
    @Autowired
    private AchatMaterielConverter achatMaterielConverter;

    @DeleteMapping("/dateAchat/{dateAchat}")
    public int deleteByDateAchat(@PathVariable LocalDateTime dateAchat) {
        return achatMaterielService.deleteByDateAchat(dateAchat);
    }

    @GetMapping("/dateAchat/{dateAchat}")
    public List<AchatMaterielDto> findByDateAchat(@PathVariable LocalDateTime dateAchat) {
        List<AchatMateriel> a = achatMaterielService.findByDateAchat(dateAchat);
        return achatMaterielConverter.toDto(a);
    }

    @PostMapping("/")
    public int save(@RequestBody AchatMaterielDto dto) {
        AchatMateriel achatMateriel = achatMaterielConverter.toBean(dto);
        return achatMaterielService.save(achatMateriel);
    }

    @GetMapping("/")
    public List<AchatMaterielDto> findAll() {
        List<AchatMateriel> list = achatMaterielService.findAll();
        return achatMaterielConverter.toDto(list);
    }
}
