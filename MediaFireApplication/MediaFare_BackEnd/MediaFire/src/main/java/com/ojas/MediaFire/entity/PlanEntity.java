package com.ojas.MediaFire.entity;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.bind.DefaultValue;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Date;

@Entity
@Table(name = "PLANS")
public class PlanEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;
    @Column(name = "NO_OF_USERS")
    private Integer noOfUsers;
    @Column(name = "NAME")
    private String name;
    @Column(name = "PRICE")
    private Double price;
    @Column(name = "STORAGE")
    private Double storageAsMb;
    @Column(name = "DESCRIPTION", columnDefinition = "MEDIUMTEXT")
    private String description;
    @Column(name = "VALIDITY")
    private Long validityAsDays;

    @Column(name = "PUBLISHED_ON")
    private LocalDateTime publishedOn;

    @Column(name = "VISIBILITY")
    private Integer visibility=1; //visible=1 ,not_visible=0

    public PlanEntity() {
    }
    public PlanEntity(Long id, Integer noOfUsers, String name, Double price, Double storageAsMb, String description, Long validityAsDays, LocalDateTime publishedOn, Integer visibility) {
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
