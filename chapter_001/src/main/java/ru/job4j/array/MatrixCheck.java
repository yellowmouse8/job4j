package ru.job4j.array;

import java.util.Arrays;

public class MatrixCheck {
    public static boolean isWin(char[][] board) {
        boolean result = false;
        int x = 0;
        int rst = 0;
        for (int row = 0; row < board.length; row++) {
            if (board[row][row] == 'X') {
                for (int cell = 0; cell < board.length; cell++) {
                    char sign = board[row][cell];
                    System.out.print(sign);
                    if (board[row][cell] == 'X') {
                        x++;
                    }
                    if (board[cell][row] == 'X') {
                        rst++;
                    }
                }
                if (x == board.length || rst == board.length) {
                    result = true;
                }
                break;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        char[][] haswinhrizont = {
                {'X', 'X', 'X', 'X', 'X'},
                {'_', '_', '_', '_', '_'},
                {'_', '_', '_', '_', '_'},
                {'_', '_', '_', '_', '_'},
                {'_', '_', '_', '_', '_'},
        };
        boolean win = isWin(haswinhrizont);
        System.out.println(" A board has a winner :" + win);
        System.out.println();
        char[][] hasWinHor = {
                {'_', '_', 'X', '_', '_'},
                {'_', '_', 'X', '_', '_'},
                {'_', '_', 'X', '_', '_'},
                {'_', '_', 'X', '_', '_'},
                {'_', '_', 'X', '_', '_'},
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
