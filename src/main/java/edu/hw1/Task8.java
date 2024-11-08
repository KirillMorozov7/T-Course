package edu.hw1;

public class Task8 {

    public static boolean knightBoardCapture(int[][] board) {
        // Проверяем, есть ли конь в каждой клетке
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (board[i][j] == 1) { // Найден конь
                    // Проверяем все возможные атаки для этого коня
                    if (isUnderAttack(board, i, j)) {
                        return false; // Конь под угрозой
                    }
                }
            }
        }
        return true; // Ни один конь не под угрозой
    }

    private static boolean isUnderAttack(int[][] board, int x, int y) {
        int[] dx = {2, 2, -2, -2, 1, 1, -1, -1};
        int[] dy = {1, -1, 1, -1, 2, -2, 2, -2};

        for (int i = 0; i < 8; i++) {
            int newX = x + dx[i];
            int newY = y + dy[i];
            // Проверяем, находятся ли новые координаты в пределах доски
            if (newX >= 0 && newX < 8 && newY >= 0 && newY < 8) {
                if (board[newX][newY] == 1) { // Найден конь, атакующий текущую позицию
                    return true;
                }
            }
        }
        return false; // Нет коней, атакующих текущую позицию
    }
