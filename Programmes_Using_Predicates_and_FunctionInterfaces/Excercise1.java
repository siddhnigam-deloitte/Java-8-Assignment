package Programmes_Using_Predicates_and_FunctionInterfaces;

import java.util.function.Predicate;

public class Excercise1 {
    public static void main(String[] args) {
        Predicate<Integer> checkeven=(i)->i%2==0;
        System.out.println(checkeven.test(2));

    }


}
