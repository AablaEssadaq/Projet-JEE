package com.example.projet_jee.ws.facade.achat;

import com.example.projet_jee.beans.achat.AchatMaterielDetail;
import com.example.projet_jee.service.facade.achat.AchatMaterielDetailService;
import com.example.projet_jee.ws.converter.achat.AchatMaterielDetailConverter;
import com.example.projet_jee.ws.dto.achat.AchatMaterielDetailDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/achatMaterielDetail")
public class AchatMaterielDetailWS {

    @Autowired
    private AchatMaterielDetailService achatMaterielDetailService;
    @Autowired
    private AchatMaterielDetailConverter detailConverter;

    @GetMapping("/code/{code}")
    public List<AchatMaterielDetailDto> findByProduitCode(@PathVariable String code) {
        List<AchatMaterielDetail> list = achatMaterielDetailService.findByProduitCode(code);
        return detailConverter.toDto(list);
    }

    @GetMapping("/qteRecue/{qteRecue}")
    public List<AchatMaterielDetailDto> findByQteRecueGreaterThan(@PathVariable double qteRecue) {
        List<AchatMaterielDetail> list = achatMaterielDetailService.findByQteRecueGreaterThan(qteRecue);
        return detailConverter.toDto(list);
    }

    @GetMapping("/montantTotal/{montantTotal}")
    public List<AchatMaterielDetailDto> findByAchatMaterielMontantTotal(@PathVariable double montantTotal) {
        List<AchatMaterielDetail> list = achatMaterielDetailService.findByAchatMaterielMontantTotal(montantTotal);
        return detailConverter.toDto(list);
    }

    @GetMapping("/qteLivree/{qteLivree}")
    public List<AchatMaterielDetailDto> findByQteLivreeLessThan(@PathVariable double qteLivree) {
        List<AchatMaterielDetail> list = achatMaterielDetailService.findByQteLivreeLessThan(qteLivree);
        return detailConverter.toDto(list);
    }

    @GetMapping("/")
    public List<AchatMaterielDetailDto> findAll() {
        List<AchatMaterielDetail> list = achatMaterielDetailService.findAll();
        return detailConverter.toDto(list);
    }

    @PostMapping("/")
    public int save(AchatMaterielDetailDto a) {
        AchatMaterielDetail achatMaterielDetail = detailConverter.toBean(a);
        return achatMaterielDetailService.save(achatMaterielDetail);
    }
}
