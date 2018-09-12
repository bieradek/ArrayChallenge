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
}
