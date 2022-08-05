package Test;

import java.io.File;
import java.io.Serializable;

public class SerilizationTest implements Serializable {
    String name;
    String password;
    SerilizationTest(String name, String pass){
        this.name = name;
        this.password = pass;
    }

    public static void main(String[] args){
        SerilizationTest user = new SerilizationTest("John","Doe");
        System.out.println("Before serialization "+user);
        System.out.println("Serialization starting.....");

        try {
            File file = new File("/home/paras/Desktop/Java Basic/User.ser");
            java.io.ObjectOutputStream out = new java.io.ObjectOutputStream(new java.io.FileOutputStream(file));
            out.writeObject(user);
            out.close();
        }
        catch(Exception e){
            e.printStackTrace();
        }

        System.out.println("Deserialization starting.....");
        try{
            File file = new File("/home/paras/Desktop/Java Basic/User.ser");
            java.io.ObjectInputStream in = new java.io.ObjectInputStream(new java.io.FileInputStream(file));
            SerilizationTest user1 = (SerilizationTest) in.readObject();
            in.close();
            System.out.println("After serialization "+user1);
        }
        catch (Exception e){
            e.printStackTrace();
        }

    }
}
