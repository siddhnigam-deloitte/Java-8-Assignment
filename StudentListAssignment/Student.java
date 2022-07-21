package StudentListAssignment;

import java.time.LocalDate;
import java.util.Arrays;

public class Student {
    int id;
    String name;
    String email;
    LocalDate dob;
    String branch;
    int marks[] = new int[5];

    public Student(int id, String name, String email, LocalDate dob, String branch, int[] marks) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.dob = dob;
        this.branch = branch;
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", dob=" + dob +
                ", branch='" + branch + '\'' +
                ", marks=" + Arrays.toString(marks) +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public int[] getMarks() {
        return marks;
    }

    public void setMarks(int[] marks) {
        this.marks = marks;
    }
}