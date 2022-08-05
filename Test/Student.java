package Test;

import java.util.Arrays;
import java.util.stream.Stream;

interface lambdaFun{
    int addition(int n, int m);
}

public class Student implements Cloneable,Comparable<Student>{
    public String name;
    public int RollNo;

    Student(String name, int RollNO){
        this.name = name;
        this.RollNo = RollNO;
    }

    @Override
    public String toString(){
        return this.name + this.RollNo;
    }

    @Override
    public int compareTo(Student s) {
        if (this.RollNo == s.RollNo){
            return 0;
        }
        else if(this.RollNo > s.RollNo){
            return 1;
        }
        return -1;
    }


    public static void main(String[] args) throws CloneNotSupportedException {
        Student s1 = new Student("Paras",18);
        Student s2 = (Student) s1.clone();
        Student s3 = s1;


        System.out.println(s1.hashCode() == s2.hashCode());
        System.out.println(s1.hashCode() == s3.hashCode());
        s3 = new Student("Vatsal",19);
        s2 = new Student("Pratik",20);
        Student[] arr = {s1,s2,s3};
        for(Student s:arr){
            System.out.println(s);
        }
        Stream<Student> sorted = Arrays.stream(arr).sorted();
        sorted.forEach(System.out::println);
    }
}
