package Courses.TP.tp2.Models;

import java.util.ArrayList;
import java.util.List;

public final class TGoldenSection {
    private float golderSectionValue;
    private List<Float> fibonacciGolderSectionValues;

    public TGoldenSection(float golderSectionValue, List<Float> fibonacciGolderSectionValues) {
        this.golderSectionValue = golderSectionValue;
        this.fibonacciGolderSectionValues = fibonacciGolderSectionValues;
    }

    public List<Float> getFibonacciGolderSectionValues() {
        return fibonacciGolderSectionValues;
    }

    public float getGolderSectionValue() {
        return golderSectionValue;
    }
    
    public void addFibonacciGoldenSection(float fibonacciGoldenSection) {
        this.fibonacciGolderSectionValues.add(fibonacciGoldenSection);
    }

}
