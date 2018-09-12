package com.timbuchalka;
//Goal is to  create a program using arrays  that sorts a list of integers in descdening order
//in other words if the array had values in your program should ultimately ave an array with
//set up a pgoram so that the numbers to sorat are read inf rom keyboard
//implement the following methods - getintegers, print arrays, sortintegers
//get integers returns an array of entered integers from keyboard
//print array prints out the contents of the array
//and sort integers should sort the array and return a new array containing the sorted numbers
//you will have to figure out how to copy the array elements from the passed array into a new array and sort them and returnd the new sorted array

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int[] myIntegers = getIntegers(5);
    }

    public static int[] getIntegers(int capacity) {
        int[] array = new int[capacity];
        System.out.println("Enter " + capacity + " integer values:\r");
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        return array;
    }

    public static void printArray(int[] array) {
        for (int i = 1; i < array.length; i++) {
            System.out.println("Element " + i + " contents " + array[i]);
        }
    }

    public static int[] sortDescending(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int third;
            if (array[i] > array[i + 1]) {
                third = array[i];
                array[i + 1] = array[i];
            }
        }
        return array;
    }

    public static int[] sortIntegers(int[] array) {
        int[] sortedArray = new int[array.length]; //creating an array which is exactly the same size as the array above
        for (int i = 0; i < array.length; i++) {
            sortedArray[i] = array[i]; // copying the values from the initial array into the copy(sortedArray)
        }
        boolean flag = true; // making sure it will execute at least once
        int temp;
        while (flag) {

            flag = false; //making sure it is not executed only once

            for (int i = 0; i < sortedArray.length - 1; i++) { // from first element of the array [0] to the last-1(due to 0 before)
                if (sortedArray[i] < sortedArray[i + 1]) { //if first element of the array is smaller than the second i.e. for example [{8},9,2,5,4]
                    temp = sortedArray[i]; //set a temporary variable and assign it the first value i.e. 8 in first iteration
                    sortedArray[i] = sortedArray[i + 1]; //assign this value to the second PLACE in the array i.e. [0] is now [1]
                    //[9,9,2,5,4] <- now first number is doubled therefore we needed to have copied the [0] element of the array to use it later
                    sortedArray[i + 1] = temp; //assigning the [1] element of the array to the previously copied "temp"
                    flag = true;
                }

                //go back to line 54 and check flag

                //after the first iteration i is equal to 1 and therefore we will be now operating on the second element of the array i.e. [9,{8},2,5,4]
                // is 8 smaller than 2 --> no it isn't therefore we skip to the next iteration
                //after the second iteration i is equal to 2 and thus we'll be operating on the following array: [9,8,{2},5,4]
                // is 2 smaller than {i+1](5)? yes it is therefore --> copy [i](2) as temp and assign [i+1](5) to temp and later restore
                // [i+1](still 5) as temp which is 2 now the array looks like this: [9,8,5,2,4]
                //after the third iteration i is equal to 3 and thus we'll be operating on the following array: [9,8,5,{2},4]
                // is 2 smaller than [i+1] element of the array i.e. 4? yes it is therefore copy [i](2) as temp and assign [i+1](4) to temp [9,8,5,4,4]
                // and later restore [i+1](still 4) as temp which is  now the array looks like this: [9,8,5,4,2]
                //after the fourth iteration i is equal to 4 and  thus we'll be operating on the following array: [9,8,5,4,{2}] <-- is [i+1] in if statement relevant here?
            }
        }
        return sortedArray;
    }
}
