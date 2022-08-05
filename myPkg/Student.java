package myPkg;
import java.time.LocalDate;


public class Student extends Person {
    public int RollNO;
    enum ExamStatus {
        ONGOING,
        PENDING,
        COMPLETE
    }
    public String fname;
    public String lname;
    public ExamStatus status;
    public LocalDate DOB;
    public Student(String fname, String lname, LocalDate DOB, int RollNO,ExamStatus status) {
        super(fname, lname, DOB);
        this.RollNO = RollNO;
        this.status = status;
    }
}
