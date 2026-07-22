package org.example;

import java.util.Scanner;

public class prime_number {
    public static void main(String[] args) {
        Scanner cs=new Scanner(System.in);
        System.out.println("enter number: ");
        int num=cs.nextInt();
        boolean isprime=true;

        if(num<=1){
            isprime=false;
        }else{
            for(int i=2;i<=num;i++){
                if(num%i==0){
                    isprime=false;
                    break;
                }else{
                    System.out.println("that number is prime number..");
                }
            }
        }
    }
}
