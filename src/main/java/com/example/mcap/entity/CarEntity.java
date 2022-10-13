package com.example.mcap.entity;

import javax.persistence.*;

@Entity
@Table(name = "car")
public class CarEntity {
    private static final long serialVersionUID= 1L;

    public CarEntity() {
    }

    public CarEntity(Long id, String carType, String carName, String carYear, String carColor) {
        this.id = id;
        this.carType = carType;
        this.carName = carName;
        this.carYear = carYear;
        this.carColor = carColor;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private Long id;
    private String carType;
    private String carName;
    private String carYear;
    private String carColor;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCarType() {
        return carType;
    }

    public void setCarType(String carType) {
        this.carType = carType;
    }

    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    public String getCarYear() {
        return carYear;
    }

    public void setCarYear(String carYear) {
        this.carYear = carYear;
    }

    public String getCarColor() {
        return carColor;
    }

    public void setCarColor(String carColor) {
        this.carColor = carColor;
    }
}
