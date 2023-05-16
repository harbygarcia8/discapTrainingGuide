package com.discaptraining.apimedicalhistory.domain.entity;


import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "discap_user")
public class DiscapUser {
    @Id
    private Integer id;

    @Column(name = "document_type")
    private String documentType;


    @Column(name = "document")
    private Integer personID;

    @Column(name = "name")
    private String name;

    @Column(name = "last_name")
    private String surname;

    @Column(name = "gender")
    private String gender;

    @Column(name = "phone")
    private String phone;

    @Column(name = "email")
    private String email;

    @Column(name = "discapacity")
    private String discapacity;

    @Column(name = "password")
    private String password;

    @Column(name = "active")
    private boolean active;

    private String registerType;

    public Integer getId() {
        return id;
    }

    public String getDocumentType() {
        return documentType;
    }

    public Integer getPersonID() {
        return personID;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getGender() {
        return gender;
    }

    public String getPhone() {
        return phone;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public boolean isActive() {
        return active;
    }


    public void setId(Integer id) {
        this.id = id;
    }

    public void setDocumentType(String documentType) {
        this.documentType = documentType;
    }

    public void setPersonID(Integer personID) {
        this.personID = personID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    public void setPassword(String password) {
        this.password = password;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public String getRegisterType() {
        return registerType;
    }

    public void setRegisterType(String registerType) {
        this.registerType = registerType;
    }

    public String getDiscapacity() {
        return discapacity;
    }

    public void setDiscapacity(String discapacity) {
        this.discapacity = discapacity;
    }
}
