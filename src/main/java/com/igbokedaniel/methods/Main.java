package main.java.com.igbokedaniel.methods;

public class Main {
    public static void main(String[] args) {
        // testing methods
        // overloaded methods share the same name but have different arguments (and therefore parameters) Method Signature: A method's signature consists of its name and the number and types of its parameters. It does not include the return type
        double a = 5;
        double b = 6;
        double c = 7;
        System.out.println(add(a, b, c));

    }
    //methods are defined outside the main method. they can either return an object (double in this case) or void in the case of the main method
    static double add(double a, double b){
        return a + b;
    }
    static double add(double a, double b, double c){
        return a + b+ c;
    }
    

}
