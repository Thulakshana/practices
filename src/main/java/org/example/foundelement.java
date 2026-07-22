package org.example;

import java.util.Scanner;

public class foundelement {
    public static void main(String[] args) {
        Scanner cs=new Scanner(System.in);
        System.out.println("enter serch value: ");
        int search=cs.nextInt();
        int[]arr={1,2,3,4,5,6};
        boolean found=false;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==search){
                found=true;
                break;
            }else{
                System.out.println("element not found..");
            }
            System.out.println("element found: ");

        }

    }


}
