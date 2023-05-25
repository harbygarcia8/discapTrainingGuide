package com.discaptraining.apimedicalhistory.controller;

import com.discaptraining.apimedicalhistory.domain.entity.MedicalHistory;
import com.discaptraining.apimedicalhistory.service.MedicalHistoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("MedicalHistory")
public class MedicalHistoryController {


    @Autowired
    private MedicalHistoryService medicalHistoryService;

    @GetMapping
    public List<MedicalHistory> getAllMedicalHistory (){
        return medicalHistoryService.getAllMedicalHistory();
    }

    @PostMapping
    public MedicalHistory createMedicalHistory(@RequestBody MedicalHistory bodyMedicalHistory){
        return medicalHistoryService.saveMedicalHistory(bodyMedicalHistory);
    }

    @PutMapping
    public MedicalHistory updateMedicalHistory(@RequestBody MedicalHistory bodyMedicalHistory){
        return medicalHistoryService.updateMedicalHistory(bodyMedicalHistory);
    }

    @DeleteMapping
    public void deleteMedicalHistory(@RequestParam Integer medicalHistoryID){
        medicalHistoryService.deleteMedicalHistory(medicalHistoryID);
    }
}
