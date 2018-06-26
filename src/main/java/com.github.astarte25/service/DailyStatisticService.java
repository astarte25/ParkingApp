package com.github.astarte25.service;

import com.github.astarte25.model.Client;
import com.github.astarte25.model.DailyStatistic;
import com.github.astarte25.model.Ticket;

import java.util.List;
import java.util.Map;

public interface DailyStatisticService {

    List<DailyStatistic> getAllDailyCash();

    DailyStatistic save(DailyStatistic dailyCash);

    Object getOneByDate(String date);

    DailyStatistic addIncome(Map<String, Double> cashMap);

    int clientPerDay(String data);

    Map<Client, Ticket> howLong();

}
