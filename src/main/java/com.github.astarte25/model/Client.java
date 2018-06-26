package com.github.astarte25.model;

import javax.persistence.*;

@Entity
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @OneToOne(mappedBy="client")
    private Ticket ticket;

    public Client() {}

    public Client(Long id, Ticket ticket) {
        this.id = id;
        this.ticket = ticket;
    }

    public long getId() {
        return id;
    }

    public Ticket getTicket() {
        return ticket;
    }

    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }

    @Override
    public String toString() {
        return "Client{" +
                "id=" + id +
                ", ticket=" + ticket +
                '}';
    }
}
