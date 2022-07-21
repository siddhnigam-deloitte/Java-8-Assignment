package StudentListAssignment;

import java.time.LocalDate;
import java.time.Period;
import java.util.*;
import java.util.stream.Collectors;

public class Assign1 {

    static int s1marks[]={80,80,80,80,80};
   public static Student student1=new Student(1,
                                "Siddh Nigam",
                                "siddh.nigam26@gmail.com",
                                LocalDate.of(2000,10,26),
                                "Information Technology",
                                s1marks);

    static int s2marks[]={70,80,90,85,82};
    public static Student student2=new Student(2,
            "PUtkarsh Singh",
            "utkarshsingh@gmail.com",
            LocalDate.of(2000,9,1),
            "Information Technology",
            s2marks);

    static int s3marks[]={65,72,80,81,89};
    public  static Student student3=new Student(3,
            "Ayush Omer",
            "ayush.omer@gmail.com",
            LocalDate.of(1995,4,24),
            "Information Technology",
            s3marks);

    static int s4marks[]={90,90,90,85,85};
    public static Student student4=new Student(4,
            "Shorya Talan",
            "Shoryatalan@gmail.com",
            LocalDate.of(1994,3,8),
            "CSE",
            s4marks);

    static int s5marks[]={81,89,80,75,77};
    public static Student student5=new Student(5,
            "Yash Raj Singh",
            "YashSingh@gmail.com",
            LocalDate.of(1990,11,20),
            "CSE",
            s5marks);

    public static void main(String[] args) {

        List<Student> studentList= Arrays.asList(student1,student2,student3,student4,student5);


        //Question1
        System.out.println("Q1");
        List<Student> ques1=filterStudentwithBranch(studentList,"CSE");
        System.out.println(ques1);

        //Question2
        System.out.println("Q2");
        List<Student> ques2=filterStudentwithAge(studentList);
        System.out.println(ques2);

        //Question3
        System.out.println("Q3");
        List<Student> ques3=SortStudentbybranch(studentList);
        System.out.println(ques3);

        //Question4
        System.out.println("Q4");
        List<Student> ques4=filterStudentwithAgeandBranch(studentList);
        System.out.println(ques4);

        //Question5
        System.out.println("Q5");
        List<Student> ques5=filterStudentswithemail(studentList);
        System.out.println(ques5);

        //Question6
        System.out.println("Q6");
        List<Student> ques6=filterStudentwithP(studentList);
        System.out.println(ques6);

        //Question7
        System.out.println("Q7");
        Average(studentList);

        //Question8
        System.out.println("Q8");
        List<LocalDate> ques8=PrintDob(studentList);
        for (LocalDate l:ques8)
        {
            System.out.println(l);
        }

    }

    //Question1
    public static List<Student> filterStudentwithBranch(List<Student> studentList,String Branch){
        return studentList.stream().filter((Student)->Student.branch.equalsIgnoreCase(Branch)).collect(Collectors.toList());
    }

    //Question2
    public static List<Student> filterStudentwithAge(List<Student> studentList){
        return studentList.stream().filter((Student)-> {return Period.between(Student.dob,LocalDate.now()).getYears()>25;}).collect(Collectors.toList());
    }

    //Question3
    public static List<Student> SortStudentbybranch(List<Student> studentList){
        return studentList.stream().sorted(Comparator.comparing(Student::getBranch)).collect(Collectors.toList());
    }

    //Question4
    public static List<Student> filterStudentwithAgeandBranch(List<Student> studentList){
        return studentList.stream().filter((Student)-> {return Period.between(Student.dob,LocalDate.now()).getYears()>25&&Student.branch.equalsIgnoreCase("CSE");}).collect(Collectors.toList());
    }

    //Question5
    public static List<Student> filterStudentswithemail(List<Student> studentList){
        List<Student>Ans=new ArrayList<>();
        List<Student> filteredStudentList = studentList;
        filteredStudentList.forEach((student) -> {
            if(student.getEmail().contains("@gmail.com")){
                Ans.add(student);
            }
        });


        return Ans;
    }

    //Question6
    public static List<Student> filterStudentwithP(List<Student> studentList){
        return studentList.stream().filter((Student)-> {return Student.name.charAt(0)=='P';}).collect(Collectors.toList());
    }

    //Question7
    public static void Average(List<Student> studentList){

        List<Student> students = studentList;
        students.forEach((s)->{
            int marks[]=s.getMarks();
            OptionalDouble average = Arrays
                    .stream(marks)
                    .mapToDouble(a -> a)
                    .average();
            System.out.println(s.getName()+": "+average.getAsDouble());
        });
    }

    //Question8
    public static List<LocalDate> PrintDob(List<Student> studentList)
    {
       return studentList.stream().map(Student::getDob).collect(Collectors.toList());
    }
    }



