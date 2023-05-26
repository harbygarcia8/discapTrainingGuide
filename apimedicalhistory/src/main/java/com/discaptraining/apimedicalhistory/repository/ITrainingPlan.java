package com.discaptraining.apimedicalhistory.repository;

import com.discaptraining.apimedicalhistory.domain.entity.DiscapUser;
import com.discaptraining.apimedicalhistory.domain.entity.TrainingPlan;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ITrainingPlan extends CrudRepository<TrainingPlan, Integer> {

    @Query(value = "SELECT id, description_video, duration, title, url, discap_user_id FROM training_plan where discap_user_id = ?1", nativeQuery = true)
    List<TrainingPlan> findByTrainingPlanDiscapUserID(Integer DiscapUserID);
}
