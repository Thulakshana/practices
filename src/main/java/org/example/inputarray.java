package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class inputarray {
    public static void main(String[] args) {
        Scanner cs=new Scanner(System.in);
        ArrayList<Integer>arr=new ArrayList<>();
        for(int i=0;i<=4;i++){
            System.out.println("enter values: ");
            arr.add(cs.nextInt());
        }
        System.out.println(arr.size());


    }
}
