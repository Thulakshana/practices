package org.example;

import java.util.Scanner;

public class arrayFindLarge {
    public static void main(String[] args) {
        Scanner abc=new Scanner(System.in);
        int[]numbers=new int[5];
        for(int i=0;i<numbers.length;i++){
            System.out.println("enter number "+(i+1)+": ");
            numbers[i]=abc.nextInt();
        }
        int large=0;
        for(int j=0;j<numbers.length;j++){
            if(numbers[j]>large){
                large=numbers[j];
            }
        }
        System.out.println(large);
    }
}
