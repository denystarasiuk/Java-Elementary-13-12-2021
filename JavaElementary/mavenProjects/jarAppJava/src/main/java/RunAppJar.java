import service.CaptchaService;

import java.util.Scanner;

public class RunAppJar {

    public static void main(String[] args) {
        inputNumber();
    }

    public static void inputNumber() {
        System.out.println("Введите число");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        if (!input.matches("[0-9]+")) {
            System.out.println("Ввели не число");
        } else {
            CaptchaService.captchaDraw(input);
        }
        System.out.println();
    }
}
