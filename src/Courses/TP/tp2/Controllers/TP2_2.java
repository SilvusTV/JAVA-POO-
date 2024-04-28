package Courses.TP.tp2.Controllers;

import java.util.List;

public class TP2_2 {
    public static List<Integer> controller(int n) {
        List<Integer> fibonacci = new java.util.ArrayList<>();
        for (int i = 0; i <= n; i++) {
            fibonacci.add(Fibonacci(i));
        }
        return fibonacci;
    }
    private static int Fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return Fibonacci(n - 1) + Fibonacci(n - 2);
    }
}
