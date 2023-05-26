package com.discaptraining.apimedicalhistory.service;

import com.discaptraining.apimedicalhistory.domain.entity.MedicalHistory;
import com.discaptraining.apimedicalhistory.repository.IMedicalHistory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MedicalHistoryService {

    @Autowired
    private IMedicalHistory medicalHistory;


    public MedicalHistory saveMedicalHistory(MedicalHistory bodyMedicalHistory){
        return medicalHistory.save(bodyMedicalHistory);
    }


    public MedicalHistory updateMedicalHistory(MedicalHistory bodyUpdateMedicalHistory){
        return medicalHistory.save(bodyUpdateMedicalHistory);
    }

    public void deleteMedicalHistory(Integer medicalHistoryID){
        medicalHistory.deleteById(medicalHistoryID);
    }

    public List<MedicalHistory> getAllMedicalHistory(){
        return (List<MedicalHistory>) medicalHistory.findAll();
    }

    public MedicalHistory getMedicalHistoryByDiscapUserID(Integer discapUserId){
        return medicalHistory.findByDiscapUserID(discapUserId);
    }

}
