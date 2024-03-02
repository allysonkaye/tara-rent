package com.example.tararent;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class car_adapter extends RecyclerView.Adapter<car_adapter.ViewHolder> {


    public class ViewHolder extends RecyclerView.ViewHolder {
        public TextView car_name, car_place, car_slot, car_price;

        public ViewHolder(View itemView) {
            super(itemView);
            car_name = (TextView) itemView.findViewById(R.id.car_name);
            car_place = (TextView) itemView.findViewById(R.id.car_place);
            car_price = (TextView) itemView.findViewById(R.id.car_price);
            car_slot = (TextView) itemView.findViewById(R.id.car_slot);
        }
    }

    private ArrayList<car_frame.Car> mCar;

    public car_adapter(ArrayList<car_frame.Car> Cars) {
        mCar = Cars;
    }

    @NonNull
    @Override
    public car_adapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);
        View carView = inflater.inflate(R.layout.activity_car_frame, parent, false);
        ViewHolder viewHolder = new ViewHolder(carView);
        return viewHolder;

    }
    @Override
    public void onBindViewHolder(car_adapter.ViewHolder holder, int position) {
        car_frame.Car car = mCar.get(position);

        TextView car_name = holder.car_name;
        TextView car_place = holder.car_place;
        TextView car_price = holder.car_price;
        TextView car_slot = holder.car_slot;

        car_name.setText(car.getCar_name() );
        car_place.setText(car.getCar_place() );
        car_price.setText(car.getCar_price() );
        car_slot.setText(car.getCar_slot() );

    }
    @Override
    public int getItemCount() {
        return mCar.size();
    }



}
