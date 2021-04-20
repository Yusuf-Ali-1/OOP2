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

        System.out.println("\n===== Person ======");

        // Person is the class we created (the type)
        // firstPerson is the name of the variable (the reference)
        // new Person() initialized an instance of Person

        Person firstPerson = new Person("Josh");
        Person secondPerson = new Person("John");
        Person thirdPerson = new Person("Jane", 45,"London");
        Person fourthPerson = new Person("Michael", 31);

        firstPerson.sayHello();
        secondPerson.sayHello();
        thirdPerson.sayHello();
        // keep  in mind that the printout from below will say John as well
        // this is still a unique value with respect to the second instance of person
        fourthPerson.sayHello();

        System.out.println("\n==== birthday and birthYear methods ====");

        System.out.println("Jane will be "+ thirdPerson.birthday() + " years old next year! ");
        System.out.println("Jane was born on " + thirdPerson.birthYear(2021));

        System.out.println("\n==== Getters and Setters ==== ");

        System.out.println(thirdPerson.getName());
        thirdPerson.setName("Mary");
        System.out.println(thirdPerson.getName());

        System.out.println("====== Book  =====");

        Book myBook = new Book("Micheal Crichton", "Jurassic Park",
                1993,"publisher", "science fiction/ thriller");

        System.out.println(myBook);


        System.out.println("====== Dog extends Animal =====");
        Dog myDog = new Dog("Chihuahua mix","Lionel", "Alpo");
        myDog.fetched();
        System.out.println(myDog);

        String cry = myDog.getSound();
        System.out.println(cry);

        Animal myPolymorphicDog = new Dog("Rat Terrier ", "Mark", "Bongo");

        // doesn't have assess to dog
        //Animal can't be a dog
        // Dog can be an animal
        //myPolymorphicDog.fetched();





    }
}
