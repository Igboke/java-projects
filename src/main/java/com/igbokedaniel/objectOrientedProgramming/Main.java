package main.java.com.igbokedaniel.objectOrientedProgramming;

public class Main {
    // introduction to object oriented programming
    public static void main(String[] args) {
        User user1 = new User("Daniel", 25, "Software Engineer", 1.75);
        User user2 = new User("Jane", 30, "Data Scientist", 1.65);
        User user3 = new User("John", 28, "Product Manager", 1.80);
        User user4 = new User("Alice", 22, "UX Designer", 1.70);
        User user5 = new User("Bob", 35, "DevOps Engineer", 1.85);
        System.out.println(user1.name + " is " + user1.age + " years old and works as a " + user1.job + " with a height of " + user1.height + "m.");
        System.out.println(User.numOfUsers);
    }
}
