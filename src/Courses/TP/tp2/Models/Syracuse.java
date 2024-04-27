package Courses.TP.tp2.Models;

import java.util.ArrayList;
import java.util.List;

public final class Syracuse {
    private int departValue;
    private List<Integer> syracuseValues;
    private int syracuseIterations;

    public Syracuse(int departValue, int syracuseIterations) {
        List<Integer> syracuseList = new ArrayList<>();
        syracuseList.add(departValue);
        this.departValue = departValue;
        this.syracuseValues = syracuseList;
        this.syracuseIterations = syracuseIterations;
    }
    public List<Integer> getSyracuseValues() {
        return syracuseValues;
    }

    public int getSyracuseIterations() {
        return syracuseIterations;
    }

    public void addSyracuseValues(int syracuseNewValue) {
        this.syracuseValues.add(syracuseNewValue);
    }

    public void setSyracuseIterations(int syracuseIterations) {
        this.syracuseIterations = syracuseIterations;
    }
}
