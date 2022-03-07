package com.example.demo.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "TBL_phone")
public class PhoneEntity {

    @Id
    private int imei;

    @Column(name = "MODEL")
    private String model;

    public PhoneEntity(int imei, String model) {
        this.imei = imei;
        this.model = model;
    }

    public int getImei() {
        return imei;
    }

    public void setImei(int imei) {
        this.imei = this.imei;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public PhoneEntity() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PhoneEntity that = (PhoneEntity) o;
        return imei == that.imei &&
                Objects.equals(model, that.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(imei, model);
    }

    @Override
    public String toString() {
        return "PhoneEntity{" +
                "imei=" + imei +
                ", model='" + model + '\'' +
                '}';
    }

}
