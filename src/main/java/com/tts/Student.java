package com.tts;

public class Student extends Person{


    private Integer gradYear;
    private boolean enrolled = false;

    public void enrolledStudent(){
        enrolled = true;
    }

    public Integer getGradYear() {
        return gradYear;
    }

    public void setGradYear(Integer gradYear) {
        this.gradYear = gradYear;
    }

    public boolean isEnrolled() {
        return enrolled;
    }

    public void setEnrolled(boolean enrolled) {
        this.enrolled = enrolled;
    }

    public Student(String name,int age, String location, Integer gradYear) {
        super(name, age, location);
        this.gradYear = gradYear;

    }

    @Override
    public String toString() {
        return "Student{" +
                "name= " + super.getName() +
                "gradYear=" + gradYear +
                ", enrolled=" + enrolled +
                '}';
    }
}
