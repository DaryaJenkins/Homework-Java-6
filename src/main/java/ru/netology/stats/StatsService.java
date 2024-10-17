package ru.netology.stats;

public class StatsService {

    public long calculateAmount(long[] sales) {
        long amount = 0;
        for (long sale : sales) {
            amount += sale;
        }
        return amount;
    }

    public long calculateAverage(long[] sales) {
        long average;
        long amount = calculateAmount(sales);
        average = amount / sales.length;
        return average;
    }

    public int maxSales(long[] sales) {
        int maxMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) {
                maxMonth = i;
            }
        }
        return maxMonth + 1;
    }

    public int minSales(long[] sales) {
        int minMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) {
                minMonth = i;
            }
        }
        return minMonth + 1; // месяца нумеруются с 1, а индексы массива с 0, нужно сдвинуть ответ на 1
    }

    public int belowAverage(long[] sales) {
        int months = 0;
        long average = calculateAverage(sales);
        for (long sale : sales) {
            if (sale < average) {
                months++;
            }
        }
        return months;
    }

    public int aboveAverage(long[] sales) {
        int months = 0;
        long average = calculateAverage(sales);
        for (long sale : sales) {
            if (sale > average) {
                months++;
            }
        }
        return months;
    }
}