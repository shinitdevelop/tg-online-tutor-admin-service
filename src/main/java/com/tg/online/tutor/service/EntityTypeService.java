package com.tg.online.tutor.service;

import com.tg.online.tutor.entity.EntityType;
import com.tg.online.tutor.repository.EntityTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class EntityTypeService {

    @Autowired
    EntityTypeRepository entityTypeRepository;

    public Optional<EntityType> findEntityTypeByName(String name){
        return  entityTypeRepository.findEntityTypeByName(name);
    }
}
