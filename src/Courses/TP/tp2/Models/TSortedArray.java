package Courses.TP.tp2.Models;

import java.util.ArrayList;
import java.util.List;

public class TSortedArray {
    private String sortType;
    private List<Integer> startArray;
    private List<Integer> sortedArray;
    private int arraySize;
    private float timeTaken;

    public TSortedArray(String sortType, int[] departValue, int[] finalValue, int arraySize, float timeTaken) {
        this.sortType = sortType;

        List<Integer> startArray = new ArrayList<>();
        addArray(departValue, startArray);
        this.startArray = startArray;

        List<Integer> sortedArray = new ArrayList<>();
        addArray(finalValue, sortedArray);
        this.sortedArray = sortedArray;

        this.arraySize = arraySize;
        this.timeTaken = timeTaken;
    }

    public List<Integer> getStartArray() {
        return startArray;
    }

    public List<Integer> getSortedArray() {
        return sortedArray;
    }
    
    public int getArraySize() {
        return arraySize;
    }

    public float getTimeTaken() {
        return timeTaken;
    }
    
    public String getSortType() {
        return sortType;
    }

    private void addArray(int[] array, List<Integer> finalList) {
        for (int j : array) {
            finalList.add(j);
        }
    }
}
