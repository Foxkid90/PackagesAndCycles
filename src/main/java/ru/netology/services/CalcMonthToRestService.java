package ru.netology.services;

public class CalcMonthToRestService {

    public int calculate(int income, int expense, int threshold) {
        int money = 0;
        int monthCounter = 0;
        for (int month = 1; month <= 12; month++) {
            if (money >= threshold) {
                System.out.println("Месяц " + month + ": Денег на счету " + money + ". Буду отдыхать. Потратил -" + expense + ", а затем ешё потратил -" + (money - ((money - expense) / 3) - expense) + ".");
                System.out.println();
                money = (money - expense) / 3;
                monthCounter = monthCounter + 1;

            } else {
                System.out.println("Месяц " + month + ": Денег на счету " + money + ". Буду работать. Заработал +" + income + ", потратил -" + expense + ".");
                System.out.println();
                money = money + income - expense;

            }

        }
        return monthCounter;

    }


}
