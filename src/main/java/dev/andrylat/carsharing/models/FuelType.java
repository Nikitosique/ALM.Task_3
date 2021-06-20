package dev.andrylat.carsharing.models;

import javax.validation.constraints.NotEmpty;

public class FuelType {
    private int id;
    private String name;

    public FuelType() {
    }

    public FuelType(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
