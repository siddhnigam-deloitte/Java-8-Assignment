package Programmes_Using_Predicates_and_FunctionInterfaces;

import java.util.function.Consumer;

public class Excercise5 {
    public static void main(String[] args) {
        Consumer<Integer> i=(num)->{System.out.println("Square of number is "+num*num);};
        i.accept(5);
    }
}
