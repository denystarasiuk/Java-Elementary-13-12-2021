package service;

import utils.GenNumber;

public class CaptchaService {

    public static void captchaDraw(String number) {
        String[] figures = number.split("");
        String[][] picture = new String[5][figures.length];
        for (int i = 0; i < figures.length; i++) {
            String[] addNumber = GenNumber.numb(figures[i]);
            picture[0][i] = addNumber[0];
            picture[1][i] = addNumber[1];
            picture[2][i] = addNumber[2];
            picture[3][i] = addNumber[3];
            picture[4][i] = addNumber[4];
        }
        for (int i = 0; i < picture.length; i++) {
            System.out.println();
            for (int j = 0; j < picture[i].length; j++) {
                System.out.print(picture[i][j]);
            }
        }
    }
}
