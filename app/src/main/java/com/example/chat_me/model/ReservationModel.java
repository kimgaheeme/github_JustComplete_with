package com.example.chat_me.model;

import android.os.Parcel;
import android.os.Parcelable;

public class ReservationModel implements Parcelable {

    public String uid;
    public String accompany;
    public String accompanySitu;
    public String hospital;
    public Object reservationDate;
    public String reservationId;

    public ReservationModel(){}

    protected ReservationModel(Parcel in) {
        uid = in.readString();
        accompany = in.readString();
        accompanySitu = in.readString();
        hospital = in.readString();
        reservationId = in.readString();
    }

    public static final Creator<ReservationModel> CREATOR = new Creator<ReservationModel>() {
        @Override
        public ReservationModel createFromParcel(Parcel in) {
            return new ReservationModel(in);
        }

        @Override
        public ReservationModel[] newArray(int size) {
            return new ReservationModel[size];
        }
    };

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

    public String getReservationId() {
        return reservationId;
    }

    public void setReservationId(String reservationId) {
        this.reservationId = reservationId;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(uid);
        dest.writeString(accompany);
        dest.writeString(accompanySitu);
        dest.writeString(hospital);
        dest.writeString(reservationId);
    }
}
