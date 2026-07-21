package org.example;

import java.sql.SQLOutput;
import java.util.Scanner;

public class evenorodd {
    public static void main(String[] args) {
        Scanner sbc=new Scanner(System.in);
        System.out.println("enter number: ");
        int num=sbc.nextInt();

        if(num%2==0){
            System.out.println("that is even number");

        }else{
            System.out.println("that is odd number");
        }
    }
}
