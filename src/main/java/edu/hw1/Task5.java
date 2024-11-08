package edu.hw1;

public class Task5 {

    // Проверка, является ли число палиндромом
    private static boolean isPalindrome(int num) {
        String str = String.valueOf(num);
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    // Получение потомка числа
    private static int descendant(int num) {
        String str = String.valueOf(num);
        StringBuilder nextGen = new StringBuilder();

        for (int i = 0; i < str.length() - 1; i++) {
            int sum = (str.charAt(i) - '0') + (str.charAt(i + 1) - '0');
            nextGen.append(sum);
        }

        return Integer.parseInt(nextGen.toString());
    }

    // Основная функция для проверки палиндрома или его потомков
    public static boolean isPalindromeDescendant(int num) {
        // Проверка исходного числа
        if (isPalindrome(num)) {
            return true;
        }

        // Проверяем потомков
        while (num >= 10) { // длина должна быть больше 1
            num = descendant(num);
            if (isPalindrome(num)) {
                return true;
            }
        }

        return false; // ни одно число не является палиндромом
    }

    // Пример тестирования
    public static void main(String[] args) {
        System.out.println(isPalindromeDescendant(11211230)); // -> true
        System.out.println(isPalindromeDescendant(13001120)); // -> true
        System.out.println(isPalindromeDescendant(23336014)); // -> true
        System.out.println(isPalindromeDescendant(11));        // -> true
        System.out.println(isPalindromeDescendant(123456));    // -> false
    }
}
