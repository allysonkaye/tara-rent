package com.example.tararent;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class carpool_list_adapter extends RecyclerView.Adapter<carpool_list_adapter.myViewHolder> {


    ArrayList<carpool_modeldata> carpooldm;
    Context context;

    public carpool_list_adapter(Context context, ArrayList<carpool_modeldata> carpooldm) {
        this.carpooldm = carpooldm;
        this.context = context;
    }
    @NonNull
    @Override
    public carpool_list_adapter.myViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(context).inflate(R.layout.carpool_list, parent, false);
        return new myViewHolder(v);


    }

    @Override
    public void onBindViewHolder(@NonNull myViewHolder holder, int position) {
        carpool_modeldata carpool_modeldata = carpooldm.get(position);
        holder.EventName.setText(carpool_modeldata.getEventName());
        holder.Date.setText(carpool_modeldata.getDate());
        holder.Place.setText(carpool_modeldata.getPlace());
        holder.Avail_cars.setText(carpool_modeldata.getAvail_cars());


    }

    @Override
    public int getItemCount() {
        return carpooldm.size();
    }

    public static class myViewHolder extends RecyclerView.ViewHolder {

          TextView EventName;
          TextView Date;
          TextView Place;
          TextView Avail_cars;

        public myViewHolder(@NonNull View itemView) {
            super(itemView);

            EventName = (TextView) itemView.findViewById(R.id.EventName);
            Date = (TextView) itemView.findViewById(R.id.Date);
            Place = (TextView) itemView.findViewById(R.id.Place);
            Avail_cars = (TextView) itemView.findViewById(R.id.Avail_cars);


        }

    }






//    public class ViewHolder extends RecyclerView.ViewHolder {
//        public TextView event_name, date, place, avail_cars;
//
//        public ViewHolder(View itemView) {
//            super(itemView);
//
//            event_name = (TextView) itemView.findViewById(R.id.Event_Name);
//            date = (TextView) itemView.findViewById(R.id.Date);
//            place = (TextView) itemView.findViewById(R.id.Place);
//            avail_cars = (TextView) itemView.findViewById(R.id.Avail_cars);
//        }
//    }
//    private ArrayList<carpool_modeldata.Carpool> mCarpools;
//
//    public carpool_list_adapter(ArrayList<carpool_modeldata.Carpool> carpools) {
//        mCarpools = carpools;
//    }
//
//    @NonNull
//    @Override
//    public carpool_list_adapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
//        Context context = parent.getContext();
//        LayoutInflater inflater = LayoutInflater.from(context);
//        View carpoolView = inflater.inflate(R.layout.carpool_list, parent, false);
//        ViewHolder viewHolder = new ViewHolder(carpoolView);
//        return viewHolder;
//    }
//
//    @Override
//    public void onBindViewHolder(carpool_list_adapter.ViewHolder holder, int position) {
//        carpool_modeldata.Carpool carpool = mCarpools.get(position);
//
//        TextView event_name = holder.event_name;
//        TextView date = holder.date;
//        TextView place = holder.place;
//        TextView avail_cars = holder.avail_cars;
//        event_name.setText(carpool.getEvent_Name());
//        date.setText(carpool.getDate());
//        place.setText(carpool.getPlace());
//        avail_cars.setText(carpool.getAvail_cars());
//
//
//    }
//
//    @Override
//    public int getItemCount() {
//        return mCarpools.size();
//    }


}



