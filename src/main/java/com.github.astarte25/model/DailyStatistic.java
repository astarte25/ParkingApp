package com.github.astarte25.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDate;

@Entity
public class DailyStatistic {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private LocalDate date;
    private double income;
    private int cars;

    public DailyStatistic() {}

    public DailyStatistic(long id, LocalDate date, double income, int cars) {
        this.id = id;
        this.date = date;
        this.income = income;
        this.cars = cars;
    }

    public long getId() {
        return id;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public double getIncome() {
        return income;
    }

    public void setIncome(double income) {
        this.income = income;
    }

    public int getCars() {
        return cars;
    }

    public void setCars(int cars) {
        this.cars = cars;
    }

    @Override
    public String toString() {
        return "DailyStatistic{" +
                "id=" + id +
                ", date=" + date +
                ", income=" + income +
                '}';
    }
}
