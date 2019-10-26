package ru.job4j.array;

import java.util.Arrays;

public class MatrixCheck {
    public static boolean isWin(char[][] board) {
        boolean result = false;
        int x = 0;
        int rst = 0;

        for (int row = 0; row < board.length; row++) {
            for (int cell = 0; cell < board.length; cell++) {
                char sign = board[row][cell];
                System.out.print(sign);
                for (row = 0; row < board.length; row++) {
                    System.out.println(" board row == " + board[row]);
                    for (cell = 0; cell < board.length; cell++) {
                        System.out.println(" board row cell " + board[row][cell]);
                        if (board[cell][row]=='X') {
                            x++;}
                            if (board[row][cell] == 'X') {
                                rst++;
                            }
                        }
                    }if (rst==board.length){result=true;}
                if (x==board.length){result=true;}
                }
            }
        return result;
    }
    public static void main(String[] args) {
        char[][] hasWinVertical = {
                {'X', 'X', 'X', 'X', 'X'},
                {'_', '_', '_', '_', '_'},
                {'_', '_', '_', '_', '_'},
                {'_', '_', '_', '_', '_'},
                {'_', '_', '_', '_', '_'},
        };
        boolean win = isWin(hasWinVertical);
        System.out.println(" A board has a winner :" + win);
        System.out.println();
        char[][] hasWinHor = {
                {'_', '_', '_', '_', '_'},
                {'X', 'X', '_', 'X', 'X'},
                {'_', '_', 'X', '_', '_'},
                {'_', '_', '_', '_', '_'},
                {'_', '_', '_', '_', '_'},
        };
        boolean winHor = isWin(hasWinHor);
        System.out.println(" A board has a winner: " + winHor);
        System.out.println();
        char[][] notWin = {
                {'_', '_', 'X', '_', '_'},
                {'_', '_', 'X', '_', '_'},
                {'_', '_', '_', 'X', '_'},
                {'_', '_', 'X', '_', '_'},
                {'_', '_', 'X', '_', '_'},
        };
        boolean lose = isWin(notWin);
        System.out.println(" A board has a winner : " + lose);
    }
}
