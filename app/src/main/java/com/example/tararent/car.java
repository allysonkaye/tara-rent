package com.example.tararent;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class car extends AppCompatActivity {
    ArrayList<car_frame.Car> carList = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_car);

        RecyclerView rvCar = (RecyclerView) findViewById(R.id.car_list);

        loadData();
        car_adapter adapter = new car_adapter(carList);
        rvCar.setAdapter(adapter);
        rvCar.setLayoutManager(new LinearLayoutManager(this));
    }

    private void loadData() {
        carList.add(new car_frame.Car("Toyota Hiace", "Malolos, Bulacan", "2 Slots", "300 per person"));
        carList.add(new car_frame.Car("Toyota Hiace", "Malolos, Bulacan", "2 Slots", "300 per person"));
        carList.add(new car_frame.Car("Toyota Hiace", "Malolos, Bulacan", "2 Slots", "300 per person"));

    }

}