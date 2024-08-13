package com.booleanuk.core;

import com.booleanuk.helpers.ExerciseBase;

import java.util.ArrayList;

import java.util.List;
public class Exercise extends ExerciseBase {
    /*
        A List is like an array but provides a much easier interface to the items it stores, for example:
        - A list doesn't need to have a predefined size, we can add and remove as many things as memory allows
        - We can more easily run looping operations on lists
        - A list is an interface that has multiple implementations depending on the data structure we want,
        e.g. ArrayList, LinkedList, Stack
        - This exercise will focus on using the ArrayList
     */

    /*
        Take some time to read and understand the method below.
        - It creates an instance of an ArrayList that will contain Integer types
            We define the data type that will be stored in a list using angled brackets:
            ArrayList<Datatype>
            We can store any data type in a list, even our own custom classes.
            ArrayList<String>
            ArrayList<Boolean>
            ArrayList<Exercise>

        - It adds a few numbers to the list
        - It outputs the list that now contains a few numbers

        Documentation: https://docs.oracle.com/en/java/javase/18/docs/api/java.base/java/util/ArrayList.html
     */
    public ArrayList<Integer> getFavouriteNumbers() {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(42);
        list.add(360);
        list.add(120);

        return list;
    }

    /*
        TODO: 1. Create a method named getSecondNumber that returns a whole number. It must return the
           second number contained in the list that is returned from getFavouriteNumbers
     */

    public int getSecondNumber(){
        ArrayList<Integer> favouriteNumbers = getFavouriteNumbers();

        if (favouriteNumbers.size()<2) {
            throw new IllegalArgumentException("The Arraylist contains less than two numbers. Please add more!");
        }

        return favouriteNumbers.get(1);


    }



    /*
        TODO: 2. Create a method named multiply that accepts two parameters in this order:
         - A list of whole numbers
         - A whole number
         The method must multiply each number in the provided list by the number provided in the second
         parameter, and then return the updated list.
         Use the ArrayList's replaceAll method to iterate through the ArrayList and replace each value with its double
         https://www.programiz.com/java-programming/library/arraylist/replaceall
     */


    public ArrayList<Integer> multiply(ArrayList<Integer> list, int multiplier) {
        list.replaceAll(e -> e * multiplier);;
        return list;
    }



    /*
        TODO: 3. Create a method named isEmpty that accepts one parameter:
         - A list of strings
         The method must return a boolean that indicates whether the provided list is empty or not
     */

    public boolean isEmpty(ArrayList<String> listOfStrings) {
        return listOfStrings.isEmpty();

    }





    /*
        TODO: 4. Create a method named addIngredient that accepts two parameters in this order:
         - A list of strings
         - A string
         The method must add the second parameter into the list provided and then return the list
     */



    public ArrayList<String> addIngredient(ArrayList<String> ingredients, String newIngredient) {

        ingredients.add(newIngredient);

        return ingredients;
        }





    /*
        TODO: 5. Create a method named removeIngredient that accepts two parameters in this order:
         - A list of strings
         - A string
         The method must remove the second parameter from the list and then return the list
     */

    public ArrayList<String> removeIngredient(ArrayList<String> ingredients, String newIngredient) {

        ingredients.remove(newIngredient);

        return ingredients;
    }



    /*
        TODO: 6. Create a method named containsIngredient that accepts two parameters in this order:
         - A list of strings
         - A string
         The method must return a boolean that indicates whether the second parameter exists in the provided list
     */


    public boolean containsIngredient(ArrayList<String> ingredients, String ingredientToCheck) {
        return ingredients.contains(ingredientToCheck);

    }



}
