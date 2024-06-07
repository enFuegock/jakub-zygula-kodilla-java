package com.kodilla.MinimalnieMaksymalni;

import java.util.Random;

public class MinAndMaxValueFinder {
    public static int[] generateRandomArray() {
        Random randomNumber = new Random();
        int arrayRandomLength = randomNumber.nextInt(26) + 5; //
        int[] arrayRandomLengthAndNumbers = new int[arrayRandomLength];
        for (int i = 0; i < arrayRandomLength; i++) {
            arrayRandomLengthAndNumbers[i] = randomNumber.nextInt(100) + 1; //
        }
        return arrayRandomLengthAndNumbers;
    }

    public static int[] FindMinMax(int[] array){
        int max = array[0];
        int min = array[0];
        for (int i = 1; i <array.length; i++) {
            if (max < array[i]) {
                max = array[i];
            }
            if (min > array[i]) {
                min = array[i];
            }
        }
        System.out.println("Lowest value in given array: "+min);
        System.out.println("Highest value in given array: "+max);
        return new int[]{min, max};
    }

    public static int FindMin(int[] array) {
        int min = array[0];
        for (int i = 1; i <array.length; i++) {
            if (min > array[i]) {
                min = array[i];
            }
        }
        return min;
    }

    public static int FindMax(int[] array) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
            }
        }
        return max;
    }


    public static void main(String[] args) {

        /*
        int[] test = generateRandomArray();
        FindMinMax(test);
        FindMax(test);
        FindMin(test);
         */
    }
}




