package AbstractShape;
public class ShapeTest {
    public static void main(String args[]) {
        Shape square = new Square(45);
        System.out.println(square.Area());
        square.nonAbstract();
        System.out.println(square.noOfSides);
    }
}
