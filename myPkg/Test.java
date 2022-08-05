package myPkg;
import java.time.LocalDate;

public class Test {
    public static void main(String[] args){
        Student S = new Student("Paras", "Raba", LocalDate.of(2000,5,15), 19,
                Student.ExamStatus.PENDING);
        System.out.println(S);
        S.eats();
        System.out.println(S.status);
    }
}