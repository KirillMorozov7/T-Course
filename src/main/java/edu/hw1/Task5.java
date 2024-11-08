package edu.hw1;

public class Task5 {

    // Функция для проверки, является ли строка палиндромом
    public static boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    // Функция для получения потомка числа в виде строки
    public static String getDescendant(String number) {
        StringBuilder descendant = new StringBuilder();

        for (int i = 0; i < number.length() - 1; i++) {
            int sum = (number.charAt(i) - '0') + (number.charAt(i + 1) - '0');
            descendant.append(sum);
        }

        return descendant.toString();
    }

    // Основная функция для проверки числа
    public static boolean isSpecialPalindrome(String number) {
        // Проверяем, является ли само число палиндромом
        if (isPalindrome(number)) {
            return true;
        }

        // Получаем потомка
        String descendant = getDescendant(number);

        // Проверяем каждый потомок
        while (descendant.length() > 1) {
            if (isPalindrome(descendant)) {
                return true;
            }
            descendant = getDescendant(descendant);
        }

        return false; // Если не найден ни один палиндром
    }

    }
}
