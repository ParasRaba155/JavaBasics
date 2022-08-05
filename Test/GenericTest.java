package Test;

public class GenericTest<A> {
    A obj;
    GenericTest(A obj){
        this.obj = obj;
    }

    public static  void main(String[] args){
        GenericTest<Integer> a1 = new GenericTest<>(4);
        GenericTest<String> a2 = new GenericTest<>("4");
        System.out.println(a1.obj);
        System.out.println(a2.obj);

    }
}
