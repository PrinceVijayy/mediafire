package com.ojas.MediaFire.model;

import javax.persistence.Column;
import java.time.LocalDateTime;

public class PlanModel {

    private Long id;
    private Integer noOfUsers;
    private String name;
    private Double price;
    private Double storageAsMb;
    private String description;
    private Long validityAsDays;

    private LocalDateTime publishedOn;

    private Integer visibility; //visible=1 ,not_visible=0

    public PlanModel() {
    }

    public PlanModel(Long id, Integer noOfUsers, String name, Double price, Double storageAsMb, String description, Long validityAsDays, LocalDateTime publishedOn, Integer visibility) {
        this.id = id;
        this.noOfUsers = noOfUsers;
        this.name = name;
        this.price = price;
        this.storageAsMb = storageAsMb;
        this.description = description;
        this.validityAsDays = validityAsDays;
        this.publishedOn = publishedOn;
        this.visibility = visibility;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getNoOfUsers() {
        return noOfUsers;
    }

    public void setNoOfUsers(Integer noOfUsers) {
        this.noOfUsers = noOfUsers;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Double getStorageAsMb() {
        return storageAsMb;
    }

    public void setStorageAsMb(Double storageAsMb) {
        this.storageAsMb = storageAsMb;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Long getValidityAsDays() {
        return validityAsDays;
    }

    public void setValidityAsDays(Long validityAsDays) {
        this.validityAsDays = validityAsDays;
    }

    public LocalDateTime getPublishedOn() {
        return publishedOn;
    }

    public void setPublishedOn(LocalDateTime publishedOn) {
        this.publishedOn = publishedOn;
    }

    public Integer getVisibility() {
        return visibility;
    }

    public void setVisibility(Integer visibility) {
        this.visibility = visibility;
    }
}
