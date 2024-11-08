package edu.hw1;

public class Task4 {

    public static void main(String[] args) {

    }

    public static String fixString(String str) {
        StringBuilder fixed = new StringBuilder();

        // Проходим по строке с шагом 2
        for (int i = 0; i < str.length(); i += 2) {
            // Если i+1 не выходит за пределы строки, меняем местами символы
            if (i + 1 < str.length()) {
                fixed.append(str.charAt(i + 1)); // Добавляем второй символ
            }
            fixed.append(str.charAt(i)); // Добавляем первый символ
        }

        return fixed.toString();
    }
}
