```java
public class FactorialCalculator {

    public static long factorial(int n) {
        if (n < 0) {
            return -1; // Возвращаем -1 для отрицательных чисел
        } else if (n == 0 || n == 1) {
            return 1; // Факториал 0 и 1 равен 1
        } else {
            long result = 1;
            for (int i = 2; i <= n; i++) {
                result *= i; // Умножаем результат на текущее число
            }
            return result; // Возвращаем вычисленный факториал
        }
    }

    public static void main(String[] args) {
        System.out.println(factorial(5));  // Вывод: 120
        System.out.println(factorial(0));  // Вывод: 1
        System.out.println(factorial(-3)); // Вывод: -1
    }
}
```