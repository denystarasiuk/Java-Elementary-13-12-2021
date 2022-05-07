package com.stonescissorspaper.service;

import com.stonescissorspaper.dto.Player;

import java.util.Scanner;

public class GameLogic {

    Scanner scanner = new Scanner(System.in);
    private Player pl;

    public void IntroGame() {
        System.out.println("Добрый день. Введите ваше имя ...");
        pl = new Player(scanner.nextLine());

        System.out.println("Введите количество игр");
        int quantityGame = Integer.parseInt(scanner.nextLine());

        String leave = "";
        do {
            System.out.println("Для старта игры нажмите [S] или [X] для выхода");
            leave = scanner.nextLine();
            if (leave.equalsIgnoreCase("X")) System.exit(-1);
        } while (!leave.equalsIgnoreCase("S"));


        while (quantityGame != 0) {

            System.out.println("Сделай свой выбор - stone, paper или scissors");
            String user = scanner.nextLine();

            String comp = Computer.genComputerChoice();

            winner(comp, user);

            quantityGame--;

        }
        showStatistic();
    }

    public void winner(String comp, String user) {
        if (comp.equals("stone") && user.equalsIgnoreCase("paper")
                || comp.equals("scissors") && user.equalsIgnoreCase("paper")
                || comp.equals("paper") && user.equalsIgnoreCase("stone")) {
            pl.setLoss(pl.getLoss() + 1);
        }
        if (comp.equals("stone") && user.equalsIgnoreCase("scissors")
                || comp.equals("scissors") && user.equalsIgnoreCase("stone")
                || comp.equals("paper") && user.equalsIgnoreCase("scissors")) {
            pl.setWin(pl.getWin() + 1);
        }
        if (comp.equals("stone") && user.equalsIgnoreCase("stone")
                || comp.equals("scissors") && user.equalsIgnoreCase("scissors")
                || comp.equals("paper") && user.equalsIgnoreCase("paper")) {
            pl.setTiedScore(pl.getTiedScore() + 1);
        }
    }

    public void showStatistic() {
        System.out.println("===============================================");
        System.out.println("Игровая статистика для игрока : " + pl.getName());
        System.out.println("Выиграно   : " + pl.getWin());
        System.out.println("Проигранно : " + pl.getLoss());
        System.out.println("Ничьих : " + pl.getTiedScore());
        System.out.println("===============================================");

    }

}

