package Programmes_Using_Predicates_and_FunctionInterfaces;

import java.util.function.Function;

public class Excercise7 {

    public static void main(String[] args) {
        Function<Integer,Integer> divideby2=(num)->num/2;;
        Function<Integer,Integer> multiplyby3=(num)->num*3;
        Function<Integer,Integer> divideandmultiply=divideby2.andThen(multiplyby3);
        int ans=divideandmultiply.apply(20);
        System.out.println(ans);
    }
}
