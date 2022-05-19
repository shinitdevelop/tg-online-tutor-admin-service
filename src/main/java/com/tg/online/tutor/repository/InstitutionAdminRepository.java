package com.tg.online.tutor.repository;

import com.tg.online.tutor.entity.InstitutionAdmin;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InstitutionAdminRepository extends CrudRepository<InstitutionAdmin, Long> {
}
