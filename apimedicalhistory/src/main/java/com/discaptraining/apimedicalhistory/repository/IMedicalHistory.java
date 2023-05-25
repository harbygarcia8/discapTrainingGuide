package com.discaptraining.apimedicalhistory.repository;

import com.discaptraining.apimedicalhistory.domain.entity.MedicalHistory;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IMedicalHistory extends CrudRepository<MedicalHistory, Integer> {


}
