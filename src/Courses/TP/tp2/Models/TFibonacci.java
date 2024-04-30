package Courses.TP.tp2.Models;

import java.util.List;

public final class TFibonacci {
    private int totalIterations;
    private List<Integer> listFibonacci;

    public TFibonacci(int totalIterations, List<Integer> listFibonacci) {
        this.totalIterations = totalIterations;
        this.listFibonacci = listFibonacci;
    }

    public int getTotalIterations() {
        return totalIterations;
    }

    public List<Integer> getlistFibonacci() {
        return listFibonacci;
    }

    public int getFibonacciValuePerIndex(int index) {
        return listFibonacci.get(index);
    }

    public void addFibonacciValueToList(int fibonacciValue) {
        this.listFibonacci.add(fibonacciValue);
    }

    public void incrementTotalIterations() {
        this.totalIterations++;
    }
}
