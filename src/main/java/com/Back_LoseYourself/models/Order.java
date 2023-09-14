package com.Back_LoseYourself.models;

import java.util.Date;

public class Order {
    private Integer id;
    private String number;
    private Date creationDate;

    private Date recievedDate;
    private double total;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public Date getRecievedDate() {
        return recievedDate;
    }

    public void setRecievedDate(Date recievedDate) {
        this.recievedDate = recievedDate;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public Order(Integer id, String number, Date creationDate, Date recievedDate, double total) {
        this.id = id;
        this.number = number;
        this.creationDate = creationDate;
        this.recievedDate = recievedDate;
        this.total = total;
    }

    public Order() {
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", number='" + number + '\'' +
                ", creationDate=" + creationDate +
                ", recievedDate=" + recievedDate +
                ", total=" + total +
                '}';
    }
}
