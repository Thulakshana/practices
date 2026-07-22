package org.example;

import java.util.ArrayList;

public class ayyaylist {
    public static void main(String[] args) {
        ArrayList<Integer>list1=new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        list1.add(5);

        list1.remove(5);
        System.out.println(list1.size());
        System.out.println(list1.contains(7));
        System.out.println(list1.indexOf(1));



    }
}
