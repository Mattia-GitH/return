package com.example.demo.model;

import java.util.Objects;

public class PhoneModel {

    private int imei;
    private String model;

    public PhoneModel(int imei, String model) {
        this.imei = imei;
        this.model = model;
    }

    public int getImei() {
        return imei;
    }

    public void setImei(int imei) {
        this.imei = imei;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public PhoneModel() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PhoneModel that = (PhoneModel) o;
        return imei == that.imei &&
                Objects.equals(model, that.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(imei, model);
    }

    @Override
    public String toString() {
        return "PhoneModel{" +
                "imei=" + imei +
                ", model='" + model + '\'' +
                '}';
    }

}
