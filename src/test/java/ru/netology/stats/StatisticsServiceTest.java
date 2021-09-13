package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StatisticsServiceTest {
    public final int[] statsData = new int[]{8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
    StatsService statsService = new StatsService();

    @Test
    void shouldCalculateSum() {
        int expected = 180;
        int actual = statsService.calculateSum(statsData);
        assertEquals(expected, actual);
        System.out.println("Сумма всех продаж: " + actual);
    }

    @Test
    void shouldCalculateAverage() {
        int expected = 15;
        int actual = statsService.calculateAverage(statsData);
        assertEquals(expected, actual);
        System.out.println("Средняя сумма продаж в месяц: " + actual);
    }

    @Test
    void shouldCalculateFindMax() {
        int expected = 8;
        int actual = statsService.calculateFindMax(statsData);
        assertEquals(expected, actual);
        System.out.println("Месяц с максимум продаж: " + actual);
    }

    @Test
    void shouldCalculateFindMin() {
        int expected = 9;
        int actual = StatsService.calculateFindMin(statsData);
        assertEquals(expected, actual);
        System.out.println("Месяц с минимум продаж: " + actual);
    }

    @Test
    void calculateBelowAverageSales() {
        int expected = 5;
        int actual = StatsService.calculateBelowAverageSales(statsData);
        assertEquals(expected, actual);
        System.out.println("Продажи ниже среднего: " + actual);
    }

    @Test
    void calculateAboveAverageSales() {
        int expected = 5;

        int actual = StatsService.calculateAboveAverageSales(statsData);
        assertEquals(expected, actual);
        System.out.println("Продажи выше среднего: " + actual);
    }
}