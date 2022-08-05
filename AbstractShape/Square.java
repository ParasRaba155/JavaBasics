package AbstractShape;

public class Square extends Shape {
    int side;
    public Square(int l){
        this.side = l;
    }
    @Override
    public int Area(){
        return this.side * this.side;
    }

}
