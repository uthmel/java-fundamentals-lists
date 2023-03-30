package com.booleanuk.helpers;

import java.util.ArrayList;

public class ExerciseBase {
    public int getSecondNumber() {
        return -1;
    }

    public ArrayList<Integer> multiply(ArrayList<Integer> list, int multiplier) {
        ArrayList<Integer> dummy = new ArrayList<>();
        dummy.add(1);
        return dummy;
    }

    public boolean isEmpty(ArrayList<String> list) {
        return false;
    }

    public ArrayList<String> addIngredient(ArrayList<String> list, String ingredient) {
        return list;
    }


    public ArrayList<String> removeIngredient(ArrayList<String> list, String ingredient) {
        return list;
    }

    public boolean containsIngredient(ArrayList<String> list, String ingredient) {
        return false;
    }
}
