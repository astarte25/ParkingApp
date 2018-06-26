package com.github.astarte25.service;

import com.github.astarte25.model.DailyStatistic;
import com.github.astarte25.model.Ticket;

import java.util.List;
import java.util.Map;

public interface TicketService {

    Ticket saveTicket(Ticket ticket);

    Ticket getOneById(long id);

    List<Ticket> getAllTickets();


}
