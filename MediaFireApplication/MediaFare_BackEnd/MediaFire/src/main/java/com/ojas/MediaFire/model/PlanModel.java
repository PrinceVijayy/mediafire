package com.ojas.MediaFire.model;

public class PlanModel {

    private Long id;
    private Integer noOfUsers;
    private String name;
    private Double price;
    private Double storageAsMb;
    private String description;
    private Long validityAsDays;

    public PlanModel() {
    }

    public PlanModel(Long id, Integer noOfUsers, String name, Double price, Double storageAsMb, String description, Long validityAsDays) {
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
