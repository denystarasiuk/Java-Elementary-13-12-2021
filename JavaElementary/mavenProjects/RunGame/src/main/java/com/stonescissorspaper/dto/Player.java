package com.stonescissorspaper.dto;

public class Player {
    private String name;
    private int loss = 0;
    private int win = 0;
    private int tiedScore = 0;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getLoss() {
        return loss;
    }

    public int getWin() {
        return win;
    }

    public int getTiedScore() {
        return tiedScore;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLoss(int loss) {
        this.loss = loss;
    }

    public void setWin(int win) {
        this.win = win;
    }

    public void setTiedScore(int tiedScore) {
        this.tiedScore = tiedScore;
    }
}
