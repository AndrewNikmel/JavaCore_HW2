package org.example.task3;

public class Task3 {
    public static void main(String[] args) {
        int[] arr_numb = {1,2,3,4,5,6,7,8};
        org.example.task3.Method3 met = new org.example.task3.Method3(arr_numb);
        if (met.test_equals()) {
            System.out.println("\nВ заданном массиве "+met.toString()
                    +"\nесть соседние элементы с нулевым значением.\n");}
        else {
            System.out.println("\nВ заданном массиве "+met.toString()
                    +"\nнет соседних элементов с нулевым значением.\n");}}
}