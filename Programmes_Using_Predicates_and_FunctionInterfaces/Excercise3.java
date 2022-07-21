package Programmes_Using_Predicates_and_FunctionInterfaces;

import java.util.function.Predicate;

public class Excercise3 {
    public static void main(String[] args) {
        Predicate<Integer> greaterThanTen = (i) -> i > 10;

        // Creating predicate
        Predicate<Integer> lowerThanTwenty = (i) -> i < 20;
        boolean result = greaterThanTen.and(lowerThanTwenty).test(15);
        System.out.println(result);
    }
}
