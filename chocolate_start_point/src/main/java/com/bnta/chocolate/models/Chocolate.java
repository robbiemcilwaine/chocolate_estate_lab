package com.bnta.chocolate.models;

<<<<<<< HEAD
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
=======
import com.fasterxml.jackson.annotation.JsonIncludeProperties;
>>>>>>> b88cb5424f20d3cc3b329946ed0f80d72047e478

import javax.annotation.processing.Generated;
import javax.persistence.*;

@Entity
@Table(name = "chocolates")
public class Chocolate {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "cocoa_percentage")
    private int cocoaPercentage;

//    many chocolates, one estate
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "estate_id")
<<<<<<< HEAD
    @JsonIgnoreProperties({"chocolates"})
=======
    @JsonIncludeProperties({"chocolates"})
>>>>>>> b88cb5424f20d3cc3b329946ed0f80d72047e478
    private Estate estate;

    public Chocolate(String name, int cocoaPercentage, Estate estate) {
        this.name = name;
        this.cocoaPercentage = cocoaPercentage;
        this.estate = estate;
    }

    public Chocolate() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCocoaPercentage() {
        return cocoaPercentage;
    }

    public void setCocoaPercentage(int cocoaPercentage) {
        this.cocoaPercentage = cocoaPercentage;
    }

    public Estate getEstate() {
        return estate;
    }

    public void setEstate(Estate estate) {
        this.estate = estate;
    }
}
