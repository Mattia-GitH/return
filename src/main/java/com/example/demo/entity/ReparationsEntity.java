package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Objects;

@Entity
@Table(name = "TBL_reparations")
public class ReparationsEntity {

    @Id
    private int imei;

    @Column(name = "STATE")
    private String state;

    @Column(name = "OLD_COMPONENT")
    private int old_component;

    @Column(name = "NEW_COMPONENT")
    private int new_component;

    public ReparationsEntity() {
    }

    public ReparationsEntity(int imei, String state, int old_component, int new_component) {
        this.imei = imei;
        this.state = state;
        this.old_component = old_component;
        this.new_component = new_component;
    }

    public int getImei() {
        return imei;
    }

    public void setImei(int imei) {
        this.imei = imei;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public int getOld_component() {
        return old_component;
    }

    public void setOld_component(int old_component) {
        this.old_component = old_component;
    }

    public int getNew_component() {
        return new_component;
    }

    public void setNew_component(int new_component) {
        this.new_component = new_component;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ReparationsEntity that = (ReparationsEntity) o;
        return imei == that.imei &&
                old_component == that.old_component &&
                new_component == that.new_component &&
                Objects.equals(state, that.state);
    }

    @Override
    public int hashCode() {
        return Objects.hash(imei, state, old_component, new_component);
    }

    @Override
    public String toString() {
        return "ReparationsEntity{" +
                "imei=" + imei +
                ", state='" + state + '\'' +
                ", old_component=" + old_component +
                ", new_component=" + new_component +
                '}';
    }
}
