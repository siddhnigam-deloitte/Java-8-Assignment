package Programmes_Using_Predicates_and_FunctionInterfaces;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Excercise2 {
    public static void main(String[] args) {
        Predicate<List<Integer>> checkempty=(e)->{if(e.size()==0){
            return true;}else {return false;}
        };
        List<Integer> list=new ArrayList<>();
        System.out.println(checkempty.test(list));

    }

}
