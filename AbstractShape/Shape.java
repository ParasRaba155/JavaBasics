package AbstractShape;

public abstract class Shape {
    public int noOfSides;
    
 
    void nonAbstract(){
        System.out.println("This is a non Abstract method");
    }
    abstract int Area();
}
