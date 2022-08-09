package DesignPattern;

public class Client {
    public static void main(String[] args){
        try{
            Document d1 = DocumentFactory.get("tar");
            d1.read();
        }
        catch(NullPointerException e){
            System.out.println("Not a valid file type");
        }
    }
}
