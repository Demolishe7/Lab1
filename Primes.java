public class Primes {
    public static void main(String[] args) {
        // Цикл от 2 до 100
        for (int i = 2; i <= 100; i++) {
            // Проверяем, является ли число i простым
            if (isPrime(i)) {
                // Если число простое, выводим его на экран
                System.out.print(i + " ");
            }
        }
    }

    // Метод для проверки, является ли число n простым
    public static boolean isPrime(int n) {
        // Цикл от 2 до n-1
        for (int i = 2; i < n; i++) {
            // Если n делится на i без остатка, то n не является простым
            if (n % i == 0) {
                return false;
            }
        }
        // Если ни одно число от 2 до n-1 не разделило n без остатка, то n простое
        return true;
    }
}