package org.example;

import java.util.Scanner;

public class reversString {
    public static void main(String[] args) {
        Scanner cs=new Scanner(System.in);
        System.out.println("enter string: ");
        String str=cs.nextLine();

        String reverse="";
        for(int i=str.length()-1;i>=0;i--){
            reverse=reverse+str.charAt(i);
        }
        System.out.println(reverse);
    }
}
