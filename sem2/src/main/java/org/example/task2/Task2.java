package org.example.task2;

public class Task2 {
    public static void main(String[] args) {
        int[] arr_numb = {1,2,3,4,5,6,7,8};
        org.example.task2.Method2 met = new org.example.task2.Method2(arr_numb);
        if (arr_numb.length>1){
            System.out.println("\nВ массиве "+met.toString()
                    +"\nразница между MAX (" +met.extr()[0]+") и MIN ("+met.extr()[1]
                    +") элементов : "+(met.extr()[0]-met.extr()[1])+"\n");}
        else {System.out.println("\nМассив должен содержать более одного элемента.\n");}
    }
}