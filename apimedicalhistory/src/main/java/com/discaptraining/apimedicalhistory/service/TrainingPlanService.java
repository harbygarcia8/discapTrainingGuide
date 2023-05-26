package com.discaptraining.apimedicalhistory.service;

import com.discaptraining.apimedicalhistory.domain.entity.TrainingPlan;
import com.discaptraining.apimedicalhistory.repository.ITrainingPlan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class TrainingPlanService {

    @Autowired
    private ITrainingPlan trainingPlan;


    public TrainingPlan saveTrainingPlan(TrainingPlan bodyTrainingPlan){
        return trainingPlan.save(bodyTrainingPlan);
    }


    public TrainingPlan updateTrainingPlan(TrainingPlan bodyUpdateTrainingPlan){
        return trainingPlan.save(bodyUpdateTrainingPlan);
    }

    public void deleteTrainingPlan(Integer trainingPlanID){
        trainingPlan.deleteById(trainingPlanID);
    }

    public List<TrainingPlan> getAllTrainingPlan(){
        return (List<TrainingPlan>) trainingPlan.findAll();
    }

    public List<TrainingPlan> getTrainingPlanDiscapUser(Integer discapUserID){
        return (List<TrainingPlan>) trainingPlan.findByTrainingPlanDiscapUserID(discapUserID);
    }
}
