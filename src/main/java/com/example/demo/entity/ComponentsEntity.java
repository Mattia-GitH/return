package com.example.demo.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "TBL_components")
public class ComponentsEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name = "SUPPLIER")
    private String supplier;

    @Column(name = "COMPONENT")
    private String component;

    public ComponentsEntity() {
    }

    public ComponentsEntity(int id, String supplier, String component) {
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
        ComponentsEntity that = (ComponentsEntity) o;
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
        return "ComponentsEntity{" +
                "id=" + id +
                ", supplier='" + supplier + '\'' +
                ", component='" + component + '\'' +
                '}';
    }
}
