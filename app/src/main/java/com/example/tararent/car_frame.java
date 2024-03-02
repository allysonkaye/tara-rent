package com.example.tararent;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class car_frame  {

    public static class Car {
        private String car_name;
        private String car_place;
        private String car_slot;
        private String car_price;

        public String getCar_name() {
            return car_name;
        }

        public String getCar_place() {
            return car_place;
        }

        public String getCar_slot() {
            return car_slot;
        }

        public String getCar_price() {
            return car_price;
        }

        public Car(String car_name, String car_place, String car_slot, String car_price) {
            this.car_name = car_name;
            this.car_place = car_place;
            this.car_slot = car_slot;
            this.car_price = car_price;
        }
    }

}
