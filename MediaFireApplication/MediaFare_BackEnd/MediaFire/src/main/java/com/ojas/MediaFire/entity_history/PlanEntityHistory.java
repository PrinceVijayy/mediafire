package com.ojas.MediaFire.entity_history;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Date;

@Entity
@Table(name = "PLANS_HISTORY")
public class PlanEntityHistory {
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

    public PlanEntityHistory() {
    }


    public PlanEntityHistory(Long id, Integer noOfUsers, String name, Double price, Double storageAsMb, String description, Long validityAsDays, LocalDateTime publishedOn) {
        this.id = id;
        this.noOfUsers = noOfUsers;
        this.name = name;
        this.price = price;
        this.storageAsMb = storageAsMb;
        this.description = description;
        this.validityAsDays = validityAsDays;
        this.publishedOn = publishedOn;

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

}
