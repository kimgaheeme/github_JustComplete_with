package com.example.chat_me.model;

public class ReservationModel {

    public String uid;
    public String accompany;
    public String accompanySitu;
    public String hospital;
    public Object reservationDate;

    public ReservationModel(){}

    public String getUid() {
        return uid;
    }

    public void setUid(String accompanySitu) {
        this.uid = uid;
    }

    public String getAccompany() {
        return accompany;
    }

    public void setAccompany(String accompany) {
        this.accompany = accompany;
    }

    public Object getReservationDate() {
        return reservationDate;
    }

    public void setReservationDate(Object reservationDate) {
        this.reservationDate = reservationDate;
    }

    public String getAccompanySitu() {
        return accompanySitu;
    }

    public void setAccompanySitu(String accompanySitu) {
        this.accompanySitu = accompanySitu;
    }

    public String getHospital() {
        return hospital;
    }

    public void setHospital(String hospital) {
        this.hospital = hospital;
    }
}
