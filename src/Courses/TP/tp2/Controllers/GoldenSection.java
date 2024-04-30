package Courses.TP.tp2.Controllers;

import Courses.TP.tp2.Models.TFibonacci;
import Courses.TP.tp2.Models.TGoldenSection;

public class GoldenSection {
    public static TGoldenSection controller(int n) {

        float golderSectionValue = (float) (1 + Math.sqrt(5)) / 2;
        TFibonacci fibonacci = Fibonacci.controller(n + 1);

        TGoldenSection tGoldenSection = new TGoldenSection(golderSectionValue, new java.util.ArrayList<>());
        for (int i = 1; i < fibonacci.getTotalIterations() - 1; i++) {
            float result = (float) fibonacci.getFibonacciValuePerIndex(i + 1) / fibonacci.getFibonacciValuePerIndex(i);
            tGoldenSection.addFibonacciGoldenSection(result);
        }

        return tGoldenSection;
    }
}
