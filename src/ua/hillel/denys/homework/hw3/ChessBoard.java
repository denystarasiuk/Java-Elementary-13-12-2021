package ua.hillel.denys.homework.hw3;

/**
 * JavaDoc
 * <p>
 * (*)Вывести на экран шахматную доску 8х8 в виде 2 мерного массива
 * (W - белые клетки , B - черные клети)
 *
 * @author Tarasiuk Denys
 */

public class ChessBoard {

    public static void main(String[] args) {

        char[][] board = new char[8][8];

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if ((i + j) % 2 == 0) {
                    board[i][j] = 'B';
                } else {
                    board[i][j] = 'W';
                }
                System.out.print(board[i][j] + "  ");
            }
            System.out.println();
        }
    }
}
