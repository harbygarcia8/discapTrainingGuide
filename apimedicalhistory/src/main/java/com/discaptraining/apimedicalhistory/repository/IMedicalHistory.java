package com.discaptraining.apimedicalhistory.repository;

import com.discaptraining.apimedicalhistory.domain.entity.MedicalHistory;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IMedicalHistory extends CrudRepository<MedicalHistory, Integer> {


    @Query(value = "SELECT MD.id, MD.description_medical_history, MD.fecha_gestion, MD.discap_user_id, MD.specialist_id FROM medical_history MD inner join discap_user DU on DU.id = MD.discap_user_id where DU.document = ?1", nativeQuery = true)
    MedicalHistory findByDiscapUserID(Integer discapUserID);


}
