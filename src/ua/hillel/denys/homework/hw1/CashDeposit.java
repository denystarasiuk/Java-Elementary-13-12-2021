package ua.hillel.denys.homework.hw1;

import java.util.Scanner;

/**
 * JavaDoc
 * <p>
 * Программу, которая предлагает пользователю ввести сумму денежного вклада в гривнах,
 * процент годовых, которые выплачивает банк, длительность вклада (лет).
 * Вывести накопленную сумму денег за каждый год и начисленные проценты.
 * (проценты сложные с капитализацией каждый месяц)
 *
 * @author Tarasiuk Denys
 */

public class CashDeposit {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Внесите сумму денежного вклада в грн.");
        double cashDeposit = in.nextDouble();

        System.out.println("Введите процентную ставку (% в год)");
        double interestRate = in.nextDouble();
        interestRate = interestRate / 100;

        System.out.println("Введите длительность вклада (лет)");
        double depositDuration = in.nextDouble();
//      double depositDurationOnMount = depositDuration*12;

        double income;
        double interestCharges;
        for (int i = 1; i <= depositDuration; i++) {
            income = cashDeposit * Math.pow((1 + (interestRate / 12)), 12);
            interestCharges = income - cashDeposit;
            cashDeposit = income;

            System.out.print("Через " + i + " лет Вы получите: " + income + " грн.");
            System.out.println(" из них начисленные проценты за один год: " + interestCharges + " грн.");
        }

    }
}
