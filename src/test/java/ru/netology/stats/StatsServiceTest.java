package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StatisticsServiceTest {
    @Test
    void shouldCalculateSum() {
        StatsService service = new StatsService();
        int[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 180;

        int actual = service.calculateSum(purchases);
        assertEquals(expected, actual);
        System.out.println("Сумма всех продаж: " + actual);
    }

    @Test
    void calculateAverage() {
        StatsService service = new StatsService();
        int[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 15;

        int actual = service.calculateAverage(purchases);
        assertEquals(expected, actual);
        System.out.println("Средняя сумма продаж в месяц: " + actual);
    }

    @Test
    void shouldCalculateFindMax() {
        StatsService service = new StatsService();
        int[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;

        int actual = service.findMax(purchases);
        assertEquals(expected, actual);
        System.out.println("Максимум продаж: " + actual);
    }

    @Test
    void shouldCalculateFindMin() {
        StatsService service = new StatsService();
        int[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 9;

        int actual = service.findMin(purchases);
        assertEquals(expected, actual);
        System.out.println("Минимум продаж: " + actual);
    }

    @Test
     void calculateBelowAverageSales() {
        StatsService service = new StatsService();
        int[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;

        int actual = service.calculateBelowAverageSales(purchases);
        assertEquals(expected, actual);
        System.out.println("Продажи ниже среднего: " + actual);
    }

    @Test
    void calculateAboveAverageSales() {
        StatsService service = new StatsService();
        int[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;

        int actual = service.calculateAboveAverageSales(purchases);
        assertEquals(expected, actual);
        System.out.println("Продажи выше среднего: " + actual);
    }
}