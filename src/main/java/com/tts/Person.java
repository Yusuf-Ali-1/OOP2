package com.tts;

public class Person {

    // a person can have a height
    // a person can have an eye color

    // a person has the following
    // a name
    // a age
    // a location
    // these are referred to as "fields" or "members" or "class variables" "or "properties"
    String name;
    int age;
    String location;
    // this constructor is parameterized
    // which means we can pass arguments into it
    public Person (String name, int age, String location){
        // below is an example of data binding
        // data binding means we can bind one piece of data with another
        // the value of the String name argument will be tied to the instance variable
        this.name = name;
        this.age = age;
        this.location = location;
    }

    //This can be referred to as an empty constructor
    // and the default constructor
    public Person(){

    }


}