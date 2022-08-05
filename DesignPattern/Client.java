package DesignPattern;

public class Client {
    public static void main(String[] args){
        try{
            Document d1 = DocumentFactory.create("tar");
            d1.read();
        }
        catch(NullPointerException e){
            System.out.println("Not a valid file type");
        }
    }
}
