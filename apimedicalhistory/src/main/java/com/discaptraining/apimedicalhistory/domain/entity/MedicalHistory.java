package com.discaptraining.apimedicalhistory.domain.entity;

import jakarta.persistence.*;

import java.util.Date;

@Entity
public class MedicalHistory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Integer id;

    //private DiscapUser discapUser;

    @Column
    private Date fechaGestion = new Date();

    @Column
    private String descriptionMedicalHistory;
    @JoinColumn
    @OneToOne
    private DiscapUser specialist;

    @JoinColumn
    @OneToOne
    private DiscapUser discapUser;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getFechaGestion() {
        return fechaGestion;
    }

    public void setFechaGestion(Date fechaGestion) {
        this.fechaGestion = fechaGestion;
    }

    public String getDescriptionMedicalHistory() {
        return descriptionMedicalHistory;
    }

    public void setDescriptionMedicalHistory(String descriptionMedicalHistory) {
        this.descriptionMedicalHistory = descriptionMedicalHistory;
    }

    public void setSpecialist(DiscapUser specialist) {
        this.specialist = specialist;
    }

    public DiscapUser getDiscapUser() {
        return discapUser;
    }

    public void setDiscapUser(DiscapUser discapUser) {
        this.discapUser = discapUser;
    }
}
