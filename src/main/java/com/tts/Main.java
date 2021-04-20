package com.tts;

import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {

        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(3);

        HashMap<String,String> hashMap = new HashMap<>();
        hashMap.put("Honda","Civic");

        Integer num = new Integer(5);
//        Integer num = 5;
        // wrapper classes and String can be utilized like primitives
        // you do not need to invoke the constructor

//        String myString = new String("this is my String");
        String myString = "this is my string";

        System.out.println("num is of type: " + num.getClass());


    }
}
