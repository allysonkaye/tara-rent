package com.example.tararent;

public class carpool_modeldata {

    String EventName, Date, Place, Avail_cars;
    public carpool_modeldata() {
    }

    public carpool_modeldata(String eventName, String date, String place, String avail_cars) {
        EventName = eventName;
        Date = date;
        Place = place;
        Avail_cars = avail_cars;
    }



    public void setEventName(String eventName) {
        EventName = eventName;
    }

    public void setDate(String date) {
        Date = date;
    }

    public void setPlace(String place) {
        Place = place;
    }

    public void setAvail_cars(String avail_cars) {
        Avail_cars = avail_cars;
    }

        public String getEventName() {
            return this.EventName;
        }
        public String getDate() {
            return this.Date;
        }
        public String getPlace() {
            return this.Place;
        }

        public String getAvail_cars() {
            return this.Avail_cars;
        }
//    }
}
