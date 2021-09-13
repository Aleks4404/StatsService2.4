package ru.netology.stats;

//int month = 0; // начинаем с нуля
//for (int value: values) {
//  // на каждой итерации прибавляем единицу
//  // таким образом для первого значения month = 1
//  month = month + 1; // в сокращённой записи: month += 1 или month++
//  // TODO: дальше работаете с value, зная, что номер месяца хранится в month

public class StatsService {
    public static int calculateSum(int[] values) { // Сумма всех продаж
        int month = 0;
        for (int value : values) {
            month += value;
        }
        return month;
    }

    public static int calculateAverage(int[] values) { // Среднюя сумма продаж в месяц
        return calculateSum(values) / values.length;
    }

    public static int calculateFindMax(int[] statsData) { //Номер месяца, в котором был пик продаж (осуществлены продажи на максимальную сумму)
        int max = findMax(statsData);
        int month = statsData[0];
        for (int i = 0; i < statsData.length; i++) {
            int findMax = 0;
            if (statsData[i] == findMax) {
                month = i;
            }
        }
        return month;
    }

    private static int findMax(int[] statsData) {
        int max = calculateAverage(statsData);

        for (int number : statsData) {
            if (max < number) {
                max = number;
            }
        }
        return max;
    }

    public static int calculateFindMin(int[] statsData) { //Номер месяца, в котором был минимум продаж (осуществлены продажи на минимальную сумму)*
        int month = 1;
        int currentMin = statsData[0];
        for (int i = 1; i < statsData.length; i++) {
            if (statsData[i] <= currentMin) {
                month = i + 1;
            }
        }
        return month;
    }

    public static int calculateBelowAverageSales(int[] statsData) { //Кол-во месяцев, в которых продажи были ниже среднего (см. п.2)
        int average = calculateAverage(statsData);
        int monthAmount = 0;
        for (int monthValue : statsData) {
            if (monthValue > average) {
                monthAmount ++;
            }
        }
        return monthAmount;
    }

    public static int calculateAboveAverageSales(int[] statsData) { //Кол-во месяцев, в которых продажи были выше среднего
        int average = calculateAverage(statsData);
        int monthAmount = 0;
        for (int monthValue : statsData) {
            if (monthValue < average) {
                monthAmount ++;
            }
        }
        return monthAmount;
    }
}