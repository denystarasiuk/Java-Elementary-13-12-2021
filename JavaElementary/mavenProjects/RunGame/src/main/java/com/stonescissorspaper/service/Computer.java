package com.stonescissorspaper.service;

import java.util.Random;

public class Computer {

    public static String genComputerChoice() {
        Random random = new Random();
        int numberRandom = random.nextInt(3) + 1;
        String computerChoice = "";
        if (numberRandom == 1) {
            computerChoice = "stone";
        } else if (numberRandom == 2) {
            computerChoice = "paper";
        } else {
            computerChoice = "scissors";
        }
        System.out.println("Компьютер выбрал: " + computerChoice);
        return computerChoice;
    }
}
