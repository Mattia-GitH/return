package com.example.demo.model;

import java.util.Date;
import java.util.Objects;

public class OrdersModel {

    private int id;
    private Date date;
    private String operator;
    private int imei;
    private boolean verified;
    private String note;

    public OrdersModel() {
    }

    public OrdersModel(int id, Date date, String operator, int imei, boolean verified, String note) {
        this.id = id;
        this.date = date;
        this.operator = operator;
        this.imei = imei;
        this.verified = verified;
        this.note = note;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public int getImei() {
        return imei;
    }

    public void setImei(int imei) {
        this.imei = imei;
    }

    public boolean isVerified() {
        return verified;
    }

    public void setVerified(boolean verified) {
        this.verified = verified;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OrdersModel that = (OrdersModel) o;
        return id == that.id &&
                imei == that.imei &&
                verified == that.verified &&
                Objects.equals(date, that.date) &&
                Objects.equals(operator, that.operator) &&
                Objects.equals(note, that.note);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, date, operator, imei, verified, note);
    }

    @Override
    public String toString() {
        return "OrdersModel{" +
                "id=" + id +
                ", date=" + date +
                ", operator='" + operator + '\'' +
                ", imei=" + imei +
                ", verified=" + verified +
                ", note='" + note + '\'' +
                '}';
    }
}
