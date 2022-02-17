package utils;

public class GenNumber {

    public static String[] numb(String figure) {
        String[] number = new String[5];
        switch (figure) {
            case "0":
                number[0] = "######  ";
                number[1] = "##  ##  ";
                number[2] = "##  ##  ";
                number[3] = "##  ##  ";
                number[4] = "######  ";
                break;
            case "1":
                number[0] = "   ##   ";
                number[1] = "  ###   ";
                number[2] = " # ##   ";
                number[3] = "   ##   ";
                number[4] = "######  ";
                break;
            case "2":
                number[0] = "#####   ";
                number[1] = "    ##  ";
                number[2] = "  ###   ";
                number[3] = "##      ";
                number[4] = "######  ";
                break;
            case "3":
                number[0] = "######  ";
                number[1] = "     #  ";
                number[2] = "######  ";
                number[3] = "     #  ";
                number[4] = "######  ";
                break;
            case "4":
                number[0] = "#    #  ";
                number[1] = "#    #  ";
                number[2] = "######  ";
                number[3] = "     #  ";
                number[4] = "     #  ";
                break;
            case "5":
                number[0] = "######  ";
                number[1] = "##      ";
                number[2] = "#####   ";
                number[3] = "    ##  ";
                number[4] = "######  ";
                break;
            case "6":
                number[0] = " #####  ";
                number[1] = "##      ";
                number[2] = "#####   ";
                number[3] = "##  ##  ";
                number[4] = " ####   ";
                break;
            case "7":
                number[0] = "######  ";
                number[1] = "   ##   ";
                number[2] = "  ##    ";
                number[3] = " ##     ";
                number[4] = "##      ";
                break;
            case "8":
                number[0] = "######  ";
                number[1] = "##  ##  ";
                number[2] = "######  ";
                number[3] = "##  ##  ";
                number[4] = "######  ";
                break;
            default:
                number[0] = " #####  ";
                number[1] = "##  ##  ";
                number[2] = " #####  ";
                number[3] = "    ##  ";
                number[4] = " ####   ";
        }
        return number;
    }
}
