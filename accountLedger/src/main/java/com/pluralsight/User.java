package com.pluralsight;

public class User {
    private String date;
    private String time;
    private int id;
    private String name;
    private float deposit;

    public User(String date, String time, int id, String name, float deposit) {
        this.date = date;
        this.time = time;
        this.id = id;
        this.name = name;
        this.deposit = deposit;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getDeposit() {
        return deposit;
    }

    public void setDeposit(float deposit) {
        this.deposit = deposit;
    }

    @Override
    public String toString() {
        return "User{" +
                "date='" + date + '\'' +
                ", time='" + time + '\'' +
                ", id=" + id +
                ", name='" + name + '\'' +
                ", deposit=" + deposit +
                '}';
    }
}
