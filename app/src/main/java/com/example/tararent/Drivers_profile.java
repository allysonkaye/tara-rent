package com.example.tararent;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class Drivers_profile extends AppCompatActivity {

    RecyclerView recyclerView;
    ArrayList<CarModel> arrayList = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drivers_profile);

        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        arrayList.add(new CarModel(R.drawable.vios,"Toyota Vios", "4"));
        arrayList.add(new CarModel(R.drawable.grandia,"Toyota Grandia", "11"));
        arrayList.add(new CarModel(R.drawable.vios,"Toyota Vios", "4"));
        arrayList.add(new CarModel(R.drawable.grandia,"Toyota Grandia", "11"));

        ModelRecyClerView modelRecyClerView = new ModelRecyClerView(this,arrayList);
        recyclerView.setAdapter(modelRecyClerView);
    }
}