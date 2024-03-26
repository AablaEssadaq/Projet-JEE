package com.example.projet_jee.service.facade.commun;

import com.example.projet_jee.beans.commun.EntiteAdmin;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface EntiteAdminService  {

    EntiteAdmin findByCode(String code);

    int deleteByCode(String code);

    List<EntiteAdmin> findAll();

    int save(EntiteAdmin entiteAdmin);
}
