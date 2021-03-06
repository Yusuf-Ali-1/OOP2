package com.tts;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(3);

        HashMap<String,String> hashMap = new HashMap<>();
        hashMap.put("Honda","Civic");

        Integer num = new Integer(5);
//        Integer num = 5;


        System.out.println("\n===== Classes and Objects ===== ");
        //getClass method used to get Class of variables
        System.out.println(num.getClass());
        System.out.println(arr.getClass());
        System.out.println(hashMap.getClass());


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

        System.out.println("\n====== Book  =====");

        Book myBook = new Book("Micheal Crichton", "Jurassic Park",
                1993,"publisher", "science fiction/ thriller");

        System.out.println(myBook);


        System.out.println("\n====== Dog extends Animal =====");
        Dog myDog = new Dog("Chihuahua mix","Lionel", "Alpo");
        myDog.fetched();
        System.out.println(myDog);

        String cry = myDog.getSound();
        System.out.println(cry);

        Animal myPolymorphicDog = new Dog("Rat Terrier ", "Mark", "Bongo");

        // my PolymorphicDog doesn't have assess to dog
        // Animal can't be a dog
        // Dog can be an animal
        // Below isn't possible because only the Dog class as the fetched method


        //myPolymorphicDog.fetched();


        System.out.println(myPolymorphicDog.getSound());

        // Polymorphism is when objects behave like other objects
        // All dogs are animals but not all animals are dogs
        // in java you can instantiate a variable as the given value's parent
        // this helps me restrict assess to certain feature s of my Dog class
        // below is an example of extreme polymorphism
        //not very useful but demonstrates the capabilities of polymorphism
        Object otherDog = new Dog("Golden Retriever","Nick", "Good Boy");


        System.out.println("\n===== Fish extends Animal =====");

        Fish fishy = new Fish("Nemo", "bloop");

        System.out.println(fishy.getSound());
        System.out.println(fishy.doSwim());

        System.out.println("====== Student extends Person =====");

        Student myStudent = new Student("Micheal",22,"Charlette",2019);

        System.out.println(myStudent);

        List<Student> studentList = new ArrayList<>();

        studentList.add(myStudent);
        studentList.add(new Student("Jane", 32, "Columbus", 2021));

        System.out.println("Here are the elements in my student list ");
        System.out.println(studentList);

        Student myStudent2 = new Student("Michael", 20, "NC", 2021);
        System.out.println(myStudent);
        myStudent.enrolledStudent();
        System.out.println(myStudent);


        List<Student> studentList1 = new ArrayList<>();

        studentList1.add(myStudent);
        studentList1.add(new Student("Janice", 32, "NC", 2021));

        System.out.println("Here are the elements in my student list: ");
//        for (Student student : studentList) {
//            System.out.println(student);
//        }

        studentList1.forEach((student) -> System.out.println(student));

        studentList1.add(Student.addStudents("name", 45, 2021));










    }
}
