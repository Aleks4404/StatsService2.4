package ru.netology.stats;

//int month = 0; // начинаем с нуля
//for (int value: values) {
//  // на каждой итерации прибавляем единицу
//  // таким образом для первого значения month = 1
//  month = month + 1; // в сокращённой записи: month += 1 или month++
//  // TODO: дальше работаете с value, зная, что номер месяца хранится в month
//}

public class StatsService {

    public int calculateSum(int[] values) { // Сумму всех продаж
        int month = 0;
        for (int value : values) {
            month += value;
        }
        return month;
    }


    public int calculateAverage(int[] values) { // Среднюю сумму продаж в месяц
        int month = this.calculateSum(values);
        return month / values.length;
    }

    public int findMax(int[] values) { //Номер месяца, в котором был пик продаж (осуществлены продажи на максимальную сумму)
        int currentMax = 0;
        int currentMaxIndex = 0;
        int month = 0;
        for (int value : values) {
            if (value > currentMax) {
                currentMax = value;
                currentMaxIndex = month;
            }
            month++;
        }
        return currentMaxIndex;
    }

    public int findMin(int[] values) { //Номер месяца, в котором был минимум продаж (осуществлены продажи на минимальную сумму)*
        int month = 1;
        int currentMin = values[0];
        for (int i = 1; i < values.length; i++) {
            if (values[i] <= currentMin) {
                month = i + 1;
            }
        }
        return month;
    }

    public int calculateBelowAverageSales(int[] values) {
        int monthAmount = 0;
        int sum = 0;
        for (int monthValue : values ){
            sum +=monthValue;
        }
        for (int monthValue : values){ //Кол-во месяцев, в которых продажи были ниже среднего (см. п.2)
            if (monthValue < this.calculateAverage(values)){
                monthAmount += 1;
            }
        }
        return monthAmount;
    }

    public int calculateAboveAverageSales(int[] values) { //Кол-во месяцев, в которых продажи были выше среднего
        int monthAmount = 0;
        int sum = 0;
        for (int monthValue : values ){
            sum +=monthValue;
        }
        for (int monthValue : values){
            if (monthValue > this.calculateAverage(values)){
                monthAmount += 1;
            }
        }
        return monthAmount;
    }

}