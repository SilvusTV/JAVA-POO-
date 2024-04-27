package Courses.TP.tp2.Controllers;

import Courses.TP.tp2.Models.Syracuse;

import java.util.List;

import static Utils.Math.isPair;

public class TP2_1 {
    public static List<Integer> controller(int departValue) {
        Syracuse syracuse = new Syracuse(departValue, 0);
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
