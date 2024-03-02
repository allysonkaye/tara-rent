package com.example.tararent;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;

public class carpool_home extends AppCompatActivity {
    private RecyclerView recyclerView;
    private FirebaseDatabase carpoolDb = FirebaseDatabase.getInstance();
    private DatabaseReference root = carpoolDb.getReference().child("carpool_modeldata");
    private carpool_list_adapter adapter;
    private ArrayList<carpool_modeldata> carpoolList;


        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_carpool_home); // private recycler view

            recyclerView = findViewById(R.id.Carpool);
            recyclerView.setHasFixedSize(true);
            recyclerView.setLayoutManager(new LinearLayoutManager(this));

            carpoolList = new ArrayList<>();
            adapter = new carpool_list_adapter(this, carpoolList);

            recyclerView.setAdapter(adapter);

            root.addValueEventListener(new ValueEventListener() {
                @Override
                public void onDataChange(@NonNull DataSnapshot snapshot) {

                    for (DataSnapshot dataSnapshot : snapshot.getChildren()) {
                        carpool_modeldata model = dataSnapshot.getValue(carpool_modeldata.class);
                        carpoolList.add(model);
                    }
                    adapter.notifyDataSetChanged();

                }

                @Override
                public void onCancelled(@NonNull DatabaseError error) {

                }
            });


//            RecyclerView rvCarpools = (RecyclerView) findViewById(R.id.Carpool);
//
//            loadData();
//            carpool_list_adapter adapter = new carpool_list_adapter(carpoolList);
//            rvCarpools.setAdapter(adapter);
//            rvCarpools.setLayoutManager(new LinearLayoutManager(this));
//
//
//
//            rvCarpools.setOnClickListener(new View.OnClickListener(){
//                public void onClick(View v){
//                    Intent op = new Intent(carpool_home.this, car.class);
//                    startActivity(op);
//                }
//            });
        }



//        private void loadData() {
//            carpoolList.add(new carpool_modeldata.Carpool("Taylor Swift the ERAS tour", "March 23, 2024", "SMDC Grounds", "10 Available cars"));
//            carpoolList.add(new carpool_modeldata.Carpool("Enhypen World Tour", "Feb 3, 2024", "Ph Arena", "34 Available cars"));
//            carpoolList.add(new carpool_modeldata.Carpool("Enhypen World Tour", "Feb 3, 2024", "Ph Arena", "34 Available cars"));
//            carpoolList.add(new carpool_modeldata.Carpool("Enhypen World Tour", "Feb 3, 2024", "Ph Arena", "34 Available cars"));
//        }




}