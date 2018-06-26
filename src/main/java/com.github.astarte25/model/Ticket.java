package com.github.astarte25.model;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
public class Ticket {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private Timestamp entryTime;
    private Timestamp departureTime;

    @OneToOne
    private Client client;

    public Ticket() {
    }

    public Ticket(long id, Timestamp entryTime, Client client) {
        this.id = id;
        this.entryTime = departureTime;
        this.client = client;
    }

    public long getId() {
        return id;
    }

    public Timestamp getEntryTime() {
        return entryTime;
    }

    public void setEntryTime(Timestamp entryTime) {
        this.entryTime = entryTime;
    }

    public Timestamp getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(Timestamp departureTime) {
        this.departureTime = departureTime;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "id=" + id +
                ", entryTime=" + entryTime +
                ", departureTime=" + departureTime +
                ", client=" + client +
                '}';
    }
}
