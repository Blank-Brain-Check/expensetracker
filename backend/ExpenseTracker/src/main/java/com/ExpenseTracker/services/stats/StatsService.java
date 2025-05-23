package com.ExpenseTracker.services.stats;

import com.ExpenseTracker.dto.GraphDTO;
import com.ExpenseTracker.dto.StatsDTO;

public interface StatsService {

    GraphDTO getChartData();

    StatsDTO getStats();
}
