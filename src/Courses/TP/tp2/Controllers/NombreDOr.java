package Courses.TP.tp2.Controllers;

import java.util.List;

public class NombreDOr {
    public static List<Float> controller(int n) {
        List<Float> nombreDOr = new java.util.ArrayList<>();
        List<Integer> fibonacci = Fibonacci.controller(n + 1);
        for (int i = 1; i < fibonacci.size()-1; i++) {
            float result = (float) fibonacci.get(i+1) / fibonacci.get(i);
            nombreDOr.add(result);
        }

        return nombreDOr;
    }
}
