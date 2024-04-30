package Courses.TP.tp2.Controllers;

import Courses.TP.tp2.Models.TGoldenSection;

import java.util.List;

public class GoldenSection {
    public static TGoldenSection controller(int n) {
        
        float golderSectionValue =(float) (1 + Math.sqrt(5)) / 2;
        List<Integer> fibonacci = Fibonacci.controller(n + 1);
        
        TGoldenSection tGoldenSection = new TGoldenSection(golderSectionValue, new java.util.ArrayList<>());
        for (int i = 1; i < fibonacci.size()-1; i++) {
            float result = (float) fibonacci.get(i+1) / fibonacci.get(i);
            tGoldenSection.addFibonacciGoldenSection(result);
        }

        return tGoldenSection;
    }
}
