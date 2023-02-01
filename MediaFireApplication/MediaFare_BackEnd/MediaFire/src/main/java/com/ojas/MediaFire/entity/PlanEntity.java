package com.ojas.MediaFire.entity;

import javax.persistence.*;

@Entity
@Table(name = "PLANS")
public class PlanEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
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

    public PlanEntity() {
    }

    public PlanEntity(Long id, Integer noOfUsers, String name, Double price, Double storageAsMb, String description, Long validityAsDays) {
        this.id = id;
        this.noOfUsers = noOfUsers;
        this.name = name;
        this.price = price;
        this.storageAsMb = storageAsMb;
        this.description = description;
        this.validityAsDays = validityAsDays;
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
}
