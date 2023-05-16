package com.discaptraining.apimedicalhistory.domain.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;

@Entity
public class MedicalHistory {

    @Id
    private Integer id;

    //private DiscapUser discapUser;

    private String descriptionMedicalHistory;

    private String specialist;


}
