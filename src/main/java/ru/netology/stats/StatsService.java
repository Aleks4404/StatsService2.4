package ru.netology.stats;

//int month = 0; // начинаем с нуля
//for (int value: values) {
//  // на каждой итерации прибавляем единицу
//  // таким образом для первого значения month = 1
//  month = month + 1; // в сокращённой записи: month += 1 или month++
//  // TODO: дальше работаете с value, зная, что номер месяца хранится в month
//}

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
        int Sum = Sum(statsData);
        int month = statsData[0];
        for (int i = 0; i < statsData.length; i++) {
            if (statsData[i] == Sum) {
                month = i;
            }
        }
        return month + 1;
    }
    private static int Sum(int[] data) {
        int Sum = calculateAverage(data);

        for (int number : data) {
            if (number >= Sum) {
                Sum = number;
            }
        }
        return Sum;
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

    public static int calculateBelowAverageSales(int[] values) { //Кол-во месяцев, в которых продажи были ниже среднего (см. п.2)
        int monthAmount = 0;
        int sum = 0;
        for (int monthValue : values) {
            sum += monthValue;
        }
        for (int monthValue : values) {
            if (monthValue < calculateAverage(values)) {
                monthAmount += 1;
            }
        }
        return monthAmount;
    }

    public static int calculateAboveAverageSales(int[] values) { //Кол-во месяцев, в которых продажи были выше среднего
        int monthAmount = 0;
        int sum = 0;
        for (int monthValue : values) {
            sum += monthValue;
        }
        for (int monthValue : values) {
            if (monthValue > calculateAverage(values)) {
                monthAmount += 1;
            }
        }
        return monthAmount;
    }

}