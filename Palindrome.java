public class Palindrome {
    public static void main(String[] args) {
        // Цикл по всем аргументам командной строки
        for (int i = 0; i < args.length; i++) {
            // Получаем текущую строку из аргументов
            String s = args[i];
            // Проверяем, является ли строка палиндромом
            if (isPalindrome(s)) {
                // Если строка палиндром, выводим соответствующее сообщение
                System.out.println(s + " палиндром.");
            } else {
                // Если строка не палиндром, выводим соответствующее сообщение
                System.out.println(s + " не является палиндромом.");
            }
        }
    }

    // Метод для реверсирования строки
    public static String reverseString(String s) {
        // Инициализируем пустую строку для хранения реверсированной строки
        String reversed = "";
        // Цикл от последнего символа строки до первого
        for (int i = s.length() - 1; i >= 0; i--) {
            // Добавляем текущий символ в начало реверсированной строки
            reversed += s.charAt(i);
        }
        // Возвращаем реверсированную строку
        return reversed;
    }

    // Метод для проверки, является ли строка палиндромом
    public static boolean isPalindrome(String s) {
        // Получаем реверсированную версию строки
        String reversed = reverseString(s);
        // Сравниваем исходную строку с реверсированной
        // Если они равны, то строка является палиндромом
        return s.equals(reversed);
    }
}