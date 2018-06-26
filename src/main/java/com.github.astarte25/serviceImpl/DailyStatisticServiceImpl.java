package com.github.astarte25.serviceImpl;

import com.github.astarte25.model.Client;
import com.github.astarte25.model.DailyStatistic;
import com.github.astarte25.model.Ticket;
import com.github.astarte25.repository.ClientRepo;
import com.github.astarte25.repository.StatisticRepo;
import com.github.astarte25.service.DailyStatisticService;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Service
public class DailyStatisticServiceImpl implements DailyStatisticService{

    StatisticRepo statisticRepo;

    @Override
    public List<DailyStatistic> getAllDailyCash() {
        return new ArrayList<>(statisticRepo.findAll());
    }

    @Override
    public DailyStatistic save(DailyStatistic dailyCash) {
        return statisticRepo.save(dailyCash);
    }

    @Override
    public DailyStatistic getOneByDate(String date) {
        return statisticRepo.findOneByDate(LocalDate.parse(date));
    }

    @Override
    public DailyStatistic addIncome(Map<String, Double> cashMap) {
        return null;
    }

    @Override
    public int clientPerDay(String data) {
      return 0;
    }

    @Override
    public Map<Client, Ticket> howLong() {
        return null;
    }
}
