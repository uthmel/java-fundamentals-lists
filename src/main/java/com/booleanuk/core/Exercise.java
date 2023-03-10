package com.booleanuk.core;

import com.booleanuk.helpers.ExerciseBase;

import java.util.ArrayList;

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



    /*
        TODO: 2. Create a method named multiply that accepts two parameters in this order:
         - A list of whole numbers
         - A whole number
         The method must multiply each number in the provided list by the number provided in the second
         parameter, and then return the updated list.
         Use a combination of a for each loop and the ArrayList set method
         https://www.w3schools.com/java/java_foreach_loop.asp
         https://docs.oracle.com/en/java/javase/18/docs/api/java.base/java/util/ArrayList.html#set(int,E)
     */



    /*
        TODO: 3. Create a method named isEmpty that accepts one parameter:
         - A list of strings
         The method must return a boolean that indicates whether the provided list is empty or not
     */



    /*
        TODO: 4. Create a method named addIngredient that accepts two parameters in this order:
         - A list of strings
         - A string
         The method must add the second parameter into the list provided and then return the list
     */



    /*
        TODO: 5. Create a method named removeIngredient that accepts two parameters in this order:
         - A list of strings
         - A string
         The method must remove the second parameter from the list and then return the list
     */



    /*
        TODO: 6. Create a method named containsIngredient that accepts two parameters in this order:
         - A list of strings
         - A string
         The method must return a boolean that indicates whether the second parameter exists in the provided list
     */



}
