package com.example.demo.model;

import java.util.Objects;

public class ComponentsModel {

    private int id;
    private String supplier;
    private String component;

    public ComponentsModel() {
    }

    public ComponentsModel(int id, String supplier, String component) {
        this.id = id;
        this.supplier = supplier;
        this.component = component;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSupplier() {
        return supplier;
    }

    public void setSupplier(String supplier) {
        this.supplier = supplier;
    }

    public String getComponent() {
        return component;
    }

    public void setComponent(String component) {
        this.component = component;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ComponentsModel that = (ComponentsModel) o;
        return id == that.id &&
                Objects.equals(supplier, that.supplier) &&
                Objects.equals(component, that.component);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, supplier, component);
    }

    @Override
    public String toString() {
        return "ComponentsModel{" +
                "id=" + id +
                ", supplier='" + supplier + '\'' +
                ", component='" + component + '\'' +
                '}';
    }
}
