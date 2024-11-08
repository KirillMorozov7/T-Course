package edu.hw1;
public class Task8 {

    public static boolean knightBoardCapture(int[][] board) {
        // Проверка на каждой клетке доски
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                // Если клетка занята конем
                if (board[i][j] == 1) {
                    // Проверяем, может ли конь в этой позиции атаковать других
                    if (isUnderAttack(board, i, j)) {
                        return false; // Если да, то возвращаем false
                    }
                }
            }
        }
        return true; // Если все кони в безопасности, возвращаем true
    }

    private static boolean isUnderAttack(int[][] board, int x, int y) {
        // Возможные движения коня
        int[] dx = {2, 2, -2, -2, 1, 1, -1, -1};
        int[] dy = {1, -1, 1, -1, 2, -2, 2, -2};

        // Проверяем каждую возможную позицию для атаки
        for (int i = 0; i < 8; i++) {
            int newX = x + dx[i];
            int newY = y + dy[i];
            // Проверяем, не выходит ли эта позиция за пределы доски
            if (newX >= 0 && newX < 8 && newY >= 0 && newY < 8) {
                // Если в целевой позиции также есть конь, возвращаем true
                if (board[newX][newY] == 1) {
                    return true;
                }
            }
        }
        return false; // Если не найдено ни одного угрожающего коня, возвращаем false
    }
}
