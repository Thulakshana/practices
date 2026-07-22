package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class arraymethods {
    public static void main(String[] args) {
        int[]num;
        num=new int[5];
        num[0]=1;
        num[1]=2;
        num[2]=3;
        num[3]=4;
        num[4]=5;

        System.out.println(Arrays.toString(num)); //print ad convert to string

        int index=Arrays.binarySearch(num,3);
        System.out.println(index); //serch in array element

        String str=Arrays.toString(num); //convert array
        System.out.println(str);

        int[][]matrix={
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                System.out.println(matrix[i][j]);
            }
        }

        int [] marks={1,2,3,4,5,6,7,89};
        for(int k=0;k<marks.length;k++){
            System.out.println("index"+k+"value"+marks[k]);
        }

        Scanner abc=new Scanner(System.in);
        int[]numm=new int[6];
        for(int g=0;g<numm.length;g++){
            System.out.println("enter number: "+(g+1)+": ");
            numm[g]=abc.nextInt();
        }
        for(int f=0;f<numm.length;f++){
            System.out.println(numm[f]);
        }





    }
}
