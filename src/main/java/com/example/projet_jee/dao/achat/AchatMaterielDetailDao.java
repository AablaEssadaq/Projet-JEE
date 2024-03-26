package com.example.projet_jee.dao.achat;


import com.example.projet_jee.beans.achat.AchatMaterielDetail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
@Transactional
public interface AchatMaterielDetailDao extends JpaRepository<AchatMaterielDetail, Long> {


    List<AchatMaterielDetail> findByProduitCode(String code);//Pour récupérer la liste des détails d'achat en fonction du code du produit

    List<AchatMaterielDetail> findByQteRecueGreaterThan(double qteRecue);//Pour récupérer la liste des détails d'achat avec une quantité reçue supérieure à une valeur donnée

    List<AchatMaterielDetail> findByAchatMaterielMontantTotal(double montantTotal);

    List<AchatMaterielDetail> findByQteLivreeLessThan(double qteLivree);//Pour récupérer la liste des détails d'achat avec une quantité livrée inférieure à une valeur donnée.




}
