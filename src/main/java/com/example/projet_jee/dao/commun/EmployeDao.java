package com.example.projet_jee.dao.commun;

import com.example.projet_jee.beans.commun.Employe;
import com.example.projet_jee.beans.commun.EntiteAdmin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeDao extends JpaRepository<Employe, Long> {
    List<Employe> findByNom(String nom); //findByNomAndPrenom
    int deleteByNom(String nom);    //deleteByNomAndPrenom
    List<Employe> findByEntiteAdminCode(String code);
    int deleteByEntiteAdminCode(String code);

}
