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
//    float answer;
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

    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    public Person(String name){
        this.name = name;

    }

    // This can be referred to as an empty constructor
    // and the no args constructor
    // all the classes have a default constructor
    public Person(){

    }

    public void sayHello(){
        // for every instance this print out will be unique
        // specifically because of the instance variable name
        System.out.println("Hello " + name);
    }

    public int birthday(){
        return age + 1;
    }

    // methods can come in many forms
    // below we have a method with parameters that wil return
    // when a person is born
    public int birthYear(int currentYear) {
        //birthYear os what is known as a local variable
        // they are only usuable within the scope of the method
        // local variables in modern versions of java
        // can be declared with the keyword var
        // var birthYear = currentYear - age is legal
        int birthYear = currentYear - age;
        //age is the instance variable
        //that we have saved

        return birthYear;
    }

    //getters and setters are traditional methods
    //

    // getter for name variable
    public String getName() {
        return name;
    }

    // setter for name variable

    public void setName(String name) {
        this.name = name;
    }


//   public void reallyHardMath(){
//        answer = (-5 + Math.sqrt(5**2 - 4 * (8*15))/(2 * 8));
//        System.out.println(answer);
//    }

}
