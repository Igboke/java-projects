package main.java.com.igbokedaniel.objectOrientedProgramming;

public class User {
    // class variables are prefixed with statis. they are properties for the class, usually used to track non unique properties
    static int numOfUsers;
    String name;
    int age;
    String job;
    double height;

    User(String name, int age, String job, double height){
        //this functions on a similar level to self in python
        this.name = name;
        this.age = age;
        this.job = job;
        this.height = height;
        numOfUsers++;
    }

}
