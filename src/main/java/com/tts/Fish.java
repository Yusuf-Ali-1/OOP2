package com.tts;

public class Fish extends Animal{

    public Fish(String name, String cry){
        super(name,cry);
    }

    public boolean doSwim(){
        System.out.println("This fish is swimming");
        return true;
    }

}
