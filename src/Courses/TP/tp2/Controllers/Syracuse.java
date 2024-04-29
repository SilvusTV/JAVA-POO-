package Courses.TP.tp2.Controllers;

import Courses.TP.tp2.Models.TSyracuse;

import java.util.List;

import static Utils.Math.isPair;

public class Syracuse {
    public static List<Integer> controller(int departValue) {
        TSyracuse syracuse = new TSyracuse(departValue, 0);
        int actualValue = departValue;
        while (actualValue != 1) {
            if (isPair(actualValue)) {
                syracuse.addSyracuseValues(actualValue / 2);
            } else {
                syracuse.addSyracuseValues((actualValue * 3) + 1);
            }
            syracuse.setSyracuseIterations(syracuse.getSyracuseIterations() + 1);
            actualValue = syracuse.getSyracuseValues().get(syracuse.getSyracuseIterations());
        }
        return syracuse.getSyracuseValues();
    }
}
