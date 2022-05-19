package com.tg.online.tutor.repository;

import com.tg.online.tutor.entity.EntityType;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.Id;
import java.util.Optional;

@Repository
public interface EntityTypeRepository extends CrudRepository<EntityType, Long> {
    public Optional<EntityType> findEntityTypeByName(String name);
}
