package com.example.projet_jee.service.impl.achat;

import com.example.projet_jee.beans.achat.TypeAchatMateriel;
import com.example.projet_jee.dao.achat.TypeAchatMaterielDao;
import com.example.projet_jee.service.facade.achat.TypeAchatMaterielService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TypeAchatMaterielImpl implements TypeAchatMaterielService {

    @Autowired
    private TypeAchatMaterielDao typeAchatMaterielDao;

    @Override
    public TypeAchatMateriel findByCode(String code) {
        return typeAchatMaterielDao.findByCode(code);
    }

    @Override
    public int deleteByCode(String code) {
        return typeAchatMaterielDao.deleteByCode(code);
    }

    @Override
    public List<TypeAchatMateriel> findAll() {
        return typeAchatMaterielDao.findAll();
    }

    @Override
    public int save(TypeAchatMateriel type) {
        typeAchatMaterielDao.save(type);
        return 1;
    }

    public TypeAchatMateriel update(TypeAchatMateriel typeAchatMateriel) {
        Optional<TypeAchatMateriel> found = typeAchatMaterielDao.findById(typeAchatMateriel.getId());
        if (found == null) return null;
        else {
            update(typeAchatMateriel);
            return typeAchatMaterielDao.save(typeAchatMateriel);
        }

    }
}
