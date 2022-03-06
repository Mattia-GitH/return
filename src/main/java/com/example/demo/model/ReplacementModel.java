package com.example.demo.model;

import java.util.Objects;

public class ReplacementModel {

    private int old_imei;
    private String note;
    private int new_imei;

    public ReplacementModel() {
    }

    public ReplacementModel(int old_imei, String note, int new_imei) {
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
        ReplacementModel that = (ReplacementModel) o;
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
        return "ReplacementModel{" +
                "old_imei=" + old_imei +
                ", note='" + note + '\'' +
                ", new_imei=" + new_imei +
                '}';
    }
}
