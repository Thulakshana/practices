package org.example;

import java.util.Scanner;

public class coutvovel {
    public static void main(String[] args) {
        Scanner cs=new Scanner(System.in);
        System.out.println("enter word: ");
        String str=cs.nextLine().toLowerCase();
        int vowel=0;
        int contraint=0;
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                vowel++;
            }else{
                contraint ++;
            }
        }
        System.out.println(vowel);
        System.out.println(contraint);
    }
}
