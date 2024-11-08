package edu.hw1;
public class Task3 {

    public static void main(String[] args) {
        int[] array1 = {3, 4, 5};
        int[] array2 = {1, 2, 6, 7};

        boolean result = canBeNested(array1, array2);
        System.out.println(result); // Вывод: true
    }

    public static boolean canBeNested(int[] a1, int[] a2) {
        if (a1 == null || a2 == null || a1.length == 0 || a2.length == 0) {
            return false; // Проверяем на null и пустые массивы
        }

        int minA1 = Integer.MAX_VALUE;
        int maxA1 = Integer.MIN_VALUE;

        for (int num : a1) {
            if (num < minA1) {
                minA1 = num;
            }
            if (num > maxA1) {
                maxA1 = num;
            }
        }

        int minA2 = Integer.MAX_VALUE;
        int maxA2 = Integer.MIN_VALUE;

        for (int num : a2) {
            if (num < minA2) {
                minA2 = num;
            }
            if (num > maxA2) {
                maxA2 = num;
            }
        }

        // Проверяем условия вложенности
        return minA1 > minA2 && maxA1 < maxA2;
    }
}
