package com.example.tararent;

public class CarModel {
    int carImg;
    String carName, carSeats;

    public CarModel(int carImg, String carName, String carSeats) {
        this.carImg = carImg;
        this.carName = carName;
        this.carSeats = carSeats;
    }

    public int getCarImg() {
        return carImg;
    }

    public void setCarImg(int carImg) {
        this.carImg = carImg;
    }

    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    public String getCarSeats() {
        return carSeats;
    }

    public void setCarSeats(String carSeats) {
        this.carSeats = carSeats;
    }
}
