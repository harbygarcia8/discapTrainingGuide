package com.discaptraining.apimedicalhistory.controller;

import com.discaptraining.apimedicalhistory.domain.entity.TrainingPlan;
import com.discaptraining.apimedicalhistory.service.TrainingPlanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("TrainingPlan")
public class TrainingPlanController {

    @Autowired
    private TrainingPlanService trainingPlanService;

    @GetMapping
    public List<TrainingPlan> getAllTrainingPlan (){
        return trainingPlanService.getAllTrainingPlan();
    }

    @PostMapping
    public TrainingPlan createTrainingPlan(@RequestBody TrainingPlan bodyTrainingPlan){
        return trainingPlanService.saveTrainingPlan(bodyTrainingPlan);
    }

    @PutMapping
    public TrainingPlan updateTrainingPlan(@RequestBody TrainingPlan bodyTrainingPlan){
        return trainingPlanService.updateTrainingPlan(bodyTrainingPlan);
    }

    @DeleteMapping
    public void deleteTrainingPlan(@RequestParam Integer trainingPlanID){
        trainingPlanService.deleteTrainingPlan(trainingPlanID);
    }
}
