package com.example.projet_jee.service.impl.achat;

import com.example.projet_jee.beans.achat.AchatMaterielDetail;
import com.example.projet_jee.dao.achat.AchatMaterielDetailDao;
import com.example.projet_jee.service.facade.achat.AchatMaterielDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AchatMaterielDetailServiceImpl implements AchatMaterielDetailService {

    @Autowired
    private AchatMaterielDetailDao achatMaterielDetailDao;


    @Override
    public List<AchatMaterielDetail> findByProduitCode(String code) {
        return achatMaterielDetailDao.findByProduitCode(code);
    }

    @Override
    public List<AchatMaterielDetail> findByQteRecueGreaterThan(double qteRecue) {
        return achatMaterielDetailDao.findByQteRecueGreaterThan(qteRecue);
    }

    @Override
    public List<AchatMaterielDetail> findByAchatMaterielMontantTotal(double montantTotal) {
        return achatMaterielDetailDao.findByAchatMaterielMontantTotal(montantTotal);
    }

    @Override
    public List<AchatMaterielDetail> findByQteLivreeLessThan(double qteLivree) {
        return achatMaterielDetailDao.findByQteLivreeLessThan(qteLivree);
    }

    @Override
    public List<AchatMaterielDetail> findAll() {
        return achatMaterielDetailDao.findAll();
    }

    @Override
    public int save(AchatMaterielDetail a) {
        achatMaterielDetailDao.save(a);
        return 1;
    }
}
