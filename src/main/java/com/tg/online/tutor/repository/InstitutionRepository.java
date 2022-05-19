package com.tg.online.tutor.repository;

import com.tg.online.tutor.entity.Institution;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.Id;
import java.util.Optional;

@Repository
public interface InstitutionRepository extends CrudRepository<Institution, Long> {


    Optional<Institution> findInstitutionsByIsActive(Boolean isActive);
}
