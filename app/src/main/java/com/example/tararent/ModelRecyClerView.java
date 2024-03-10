package com.example.tararent;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ModelRecyClerView extends RecyclerView.Adapter<ModelRecyClerView.ViewHolder> {

    Context context;
    ArrayList<CarModel> arrayList = new ArrayList<>();

    public ModelRecyClerView(Context context, ArrayList<CarModel> arrayList) {
        this.context = context;
        this.arrayList = arrayList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(context).inflate(R.layout.car_item,parent,false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        holder.carImg.setImageResource(arrayList.get(position).getCarImg());
        holder.carName.setText(arrayList.get(position).getCarName());
        holder.carSeats.setText(arrayList.get(position).getCarSeats());
    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        ImageView carImg;
        TextView carName, carSeats;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            carImg = itemView.findViewById(R.id.carImg);
            carName = itemView.findViewById(R.id.carName);
            carSeats = itemView.findViewById(R.id.carSeats);
        }
    }
}

