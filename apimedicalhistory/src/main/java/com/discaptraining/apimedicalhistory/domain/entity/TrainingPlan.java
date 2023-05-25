package com.discaptraining.apimedicalhistory.domain.entity;

import jakarta.persistence.*;

public class TrainingPlan {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Integer id;

    @Column
    private String title;

    @Column
    private String descriptionVideo;

    @OneToOne
    @Column
    private DiscapUser discapUser;

    @Column
    private String duration;

    @Column
    private String url;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescriptionVideo() {
        return descriptionVideo;
    }

    public void setDescriptionVideo(String descriptionVideo) {
        this.descriptionVideo = descriptionVideo;
    }

    public DiscapUser getDiscapUser() {
        return discapUser;
    }

    public void setDiscapUser(DiscapUser discapUser) {
        this.discapUser = discapUser;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
