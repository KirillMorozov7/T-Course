package edu.hw1;

public class Task7 {

    // Функция для циклического сдвига влево
    public static int rotateLeft(int n, int shift) {
        // Убедимся, что размер сдвига не превышает 32 бита
        shift = shift % 32;
        // Сдвигаем влево и применяем побитовый AND для сохранения
        // только младших 32 бит (чтобы избежать переполнения)
        return (n << shift) | (n >>> (32 - shift));
    }

    // Функция для циклического сдвига вправо
    public static int rotateRight(int n, int shift) {
        // Убедимся, что размер сдвига не превышает 32 бита
        shift = shift % 32;
        // Сдвигаем вправо и применяем побитовый AND для сохранения
        // только младших 32 бит (чтобы избежать переполнения)
        return (n >>> shift) | (n << (32 - shift));
    }

    public static void main(String[] args) {
        System.out.println(rotateRight(8, 1)); // 4
        System.out.println(rotateLeft(16, 1)); // 1
        System.out.println(rotateLeft(17, 2)); // 6
    }
}
