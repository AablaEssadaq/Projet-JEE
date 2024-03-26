package com.example.projet_jee.service.facade.achat;

import com.example.projet_jee.beans.achat.AchatMaterielDetail;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface AchatMaterielDetailService{


    List<AchatMaterielDetail> findByProduitCode(String code);

    List<AchatMaterielDetail> findByQteRecueGreaterThan(double qteRecue);

    List<AchatMaterielDetail> findByAchatMaterielMontantTotal(double montantTotal);

    List<AchatMaterielDetail> findByQteLivreeLessThan(double qteLivree);

    List<AchatMaterielDetail> findAll();

    int save(AchatMaterielDetail a);
}
