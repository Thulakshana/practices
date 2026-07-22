package org.example;

import java.util.Scanner;

public class palidromwords {
    public static void main(String[] args) {
        Scanner cs=new Scanner(System.in);
        System.out.println("enter word ");
        String str=cs.nextLine();
        String reverse="";
        for(int i=str.length()-1;i<=0;i--){
            reverse=reverse+str.charAt(i);
        }
        System.out.println(reverse);
        if(reverse.equals(str)){
            System.out.println("that is palidrom word...");
        }else{
            System.out.println("that is not palidrom word...");
        }
    }
}
