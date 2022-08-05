package ShapePkg;

public class Rectange implements Shape{
    public int length, width;

    /**
     * Rectangle constructor
     * @param l The value to length.
     * @param b the value to breadth.
     * @return Rectangle object
     *
     */
    public Rectange(int l, int b){
        this.length = l;
        this.width = b;
    }

    /**
     * <p>Constructor with only length given</p>
     * Length and width will be initialised to be equal
     * @param l The value of length
     * @return Rectangle object
     */
    public Rectange(int l){
        this.length = this.width = l;
    }

    /**
     * <p>Constructor with no parameters</p>
     * Length and width will be initialised to be 0(zero)
     *
     * @return Rectangle object
     */
    public Rectange() {this.length = this.width = 0;}

    /**
     * Calculates the area of the rectange
     * @return Area
     */
    @Override
    public int Area() {
        return this.length * this.width;
    }

    @Override
    public int Perimeter() {
        return 2 * (this.width + this.length);
    }

    @Override
    public String toString(){
        return "Rectangle : \nLength : "+this.length+" units\nbredth : "+this.width+" units\nArea: "+this.Area()
                +"sq. units\nPerimeter: "+this.Perimeter()+" units";
    }
}


