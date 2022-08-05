package DesignPattern;

public interface Document {
    public void read();
}

class RarDocs implements Document{

    @Override
    public void read() {
        System.out.println("rar file has been read");
    } 
}

class TarDocs implements Document{

    @Override
    public void read() {
        System.out.println("tar file has been read");
    } 
}

class ZipDocs implements Document{

    @Override
    public void read() {
        System.out.println("zip file has been read");
    }
}