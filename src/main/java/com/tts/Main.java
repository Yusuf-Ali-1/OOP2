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


        //getClass method used to get Class of variables
        num.getClass();
        arr.getClass();
        hashMap.getClass();


        // wrapper classes and String can be utilized like primitives
        // you do not need to invoke the constructor

//        String myString = new String("this is my String");
        String myString = "this is my string";

        System.out.println("num is of type: " + num.getClass());

        System.out.println("===== Person ======");

        // Person is the class we created (the type)
        // firstPerson is the name of the variable (the reference)
        // new Person() initialized an instance of Person

        Person firstPerson = new Person("Jane");
        Person secondPerson = new Person("John");
        Person thirdPerson = new Person("Jane", 45,"London");
        Person fourthPerson = new Person("John");

        firstPerson.sayHello();
        secondPerson.sayHello();
        thirdPerson.sayHello();
        // keep  in mind that the printout from below will say John as well
        // this is still a unique value with respect to the second instance of person
        fourthPerson.sayHello();

        System.out.println("Jane will be "+ thirdPerson.birthday() + " years old next year! ");

    }
}
