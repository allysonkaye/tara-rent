package com.example.tararent;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.tararent.databinding.ActivityMainBinding;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;

public class upload_event extends AppCompatActivity {

    ActivityMainBinding binding;
    EditText addEvent_name, addDate, addPlace,  addAvail_cars;
    Button addData, done;

//    DatabaseReference carpoolDb;
    private FirebaseDatabase carpoolDb = FirebaseDatabase.getInstance();

    private DatabaseReference root = carpoolDb.getReference().child("carpool_modeldata");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_upload_event);

        addEvent_name = findViewById(R.id.addEvent_name);
        addDate = findViewById(R.id.addDate);
        addPlace = findViewById(R.id.addPlace);
        addAvail_cars = findViewById(R.id.addAvail_cars);
        addData = findViewById(R.id.addData);
        done = findViewById(R.id.done);


//        carpoolDb = FirebaseDatabase.getInstance().getReference().child("carpool_modeldata");

        addData.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                insertCarpoolEvent();
                String EventName = addEvent_name.getText().toString();
                String Date = addDate.getText().toString();
                String Place = addPlace.getText().toString();
                String Avail_cars = addAvail_cars.getText().toString();
//

                carpool_modeldata carpool_modeldata = new carpool_modeldata(EventName, Date, Place, Avail_cars);

                root.child(EventName).setValue(carpool_modeldata).addOnCompleteListener(new OnCompleteListener<Void>() {
                    @Override
                    public void onComplete(@NonNull Task<Void> task) {

                        addEvent_name.setText("");
                        addDate.setText("");
                        addPlace.setText("");
                        addAvail_cars.setText("");

                        Toast.makeText(upload_event.this, "Data saved", Toast.LENGTH_SHORT).show();

                    }
                });

            }
        });


        done.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(upload_event.this, carpool_home.class);
                startActivity(i);

            }
        });
    }
//    private void insertCarpoolEvent() {
//        String Event_name = addEvent_name.getText().toString();
//        String Date = addDate.getText().toString();
//        String Place = addPlace.getText().toString();
//        String Avail_cars = addAvail_cars.getText().toString();
//
//        carpool_modeldata carpool_modeldata = new carpool_modeldata(Event_name, Date, Place, Avail_cars);
//
//        carpoolDb.push().setValue(carpool_modeldata);
//        Toast.makeText(upload_event.this, "Successfully inserted the data", Toast.LENGTH_SHORT).show();
//    }
}