package com.hacker.olevel.tencom.modules;

import java.util.Random;

/**
 * Created by olevel on 8/15/16.
 */

public class StoredSample {
    /* Data Members */
    Long id;
    String name;
    String description;
    Date manufacturingDate; // Date of making sample
    int shelfLife; // number of days of storage


    /* Constructor*/
    public StoredSample(){
    }

    /* Getter and setter methods */
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getManufacturingDate() {
        return manufacturingDate;
    }

    public void setManufacturingDate(Date manufacturingDate) {
        this.manufacturingDate = manufacturingDate;
    }

    public int getShelfLife() {
        return shelfLife;
    }

    public void setShelfLife(int shelfLife) {
        this.shelfLife = shelfLife;
    }
}
