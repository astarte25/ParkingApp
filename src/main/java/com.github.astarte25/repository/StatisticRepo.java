package com.github.astarte25.repository;

import com.github.astarte25.model.DailyStatistic;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;

@Repository
public interface StatisticRepo extends JpaRepository<DailyStatistic, Long> {

    DailyStatistic findOneByDate(LocalDate date);

}
