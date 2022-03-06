package com.example.demo.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "TBL_replacement")
public class ReplacementEntity {

    @Id
    @Column(name = "OLD_IMEI")
    private int old_imei;

    @Column(name = "NOTE")
    private String note;

    @Column(name = "NEW_IMEI")
    private int new_imei;

    public ReplacementEntity() {
    }

    public ReplacementEntity(int old_imei, String note, int new_imei) {
        this.old_imei = old_imei;
        this.note = note;
        this.new_imei = new_imei;
    }

    public int getOld_imei() {
        return old_imei;
    }

    public void setOld_imei(int old_imei) {
        this.old_imei = old_imei;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public int getNew_imei() {
        return new_imei;
    }

    public void setNew_imei(int new_imei) {
        this.new_imei = new_imei;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ReplacementEntity that = (ReplacementEntity) o;
        return old_imei == that.old_imei &&
                new_imei == that.new_imei &&
                Objects.equals(note, that.note);
    }

    @Override
    public int hashCode() {
        return Objects.hash(old_imei, note, new_imei);
    }

    @Override
    public String toString() {
        return "ReplacementEntity{" +
                "old_imei=" + old_imei +
                ", note='" + note + '\'' +
                ", new_imei=" + new_imei +
                '}';
    }
}
