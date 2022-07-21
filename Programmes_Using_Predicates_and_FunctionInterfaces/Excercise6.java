package Programmes_Using_Predicates_and_FunctionInterfaces;


@FunctionalInterface
interface StringLength{
    int findlength(String s);
}

public class Excercise6 {


    public static void main(String[] args) {

        StringLength s=(String s1)->{
            return s1.length();
        };

        int ans= s.findlength("Deloitte");
        System.out.println(ans);
    }
}
