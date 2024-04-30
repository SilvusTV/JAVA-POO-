package Courses.TP.tp2.Controllers;

import Courses.TP.tp2.Models.TFibonacci;


public class Fibonacci {
    public static TFibonacci controller(int n) {
        TFibonacci Fibonacci = new TFibonacci(0, new java.util.ArrayList<>());

        for (int i = 0; i <= n; i++) {
            Fibonacci.addFibonacciValueToList(Fibonacci(i));
            Fibonacci.incrementTotalIterations();
        }
        return Fibonacci;
    }

    private static int Fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return Fibonacci(n - 1) + Fibonacci(n - 2);
    }
}
