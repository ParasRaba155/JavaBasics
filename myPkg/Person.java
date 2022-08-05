package myPkg;
import java.time.*;

public class Person {
    public String fname, lname;
    public LocalDate DOB;

    public Person(String fname, String lname, LocalDate DOB){
        this.fname = fname;
        this.lname = lname;
        this.DOB = DOB;
    }

    public void eats(){
        System.out.println(this.fname + " is eating food");
    }

    /**
     * Calculates the age by subtracting curr date from DOB and returns the years
     * @param this
     * @return the age of Person
     */
    public int age(){
        LocalDate currDate = LocalDate.now();
        Period p = Period.between(this.DOB, currDate);
        return p.getYears();
    }

    @Override
    public String toString(){
        return "Info\nName: "+this.fname+"\nSurname: "+this.lname+"\nDOB: "+this.DOB;
    }
}
