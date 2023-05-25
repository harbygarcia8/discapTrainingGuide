package com.discaptraining.apimedicalhistory.repository;

import com.discaptraining.apimedicalhistory.domain.entity.TrainingPlan;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ITrainingPlan extends CrudRepository<TrainingPlan, Integer> {

}
