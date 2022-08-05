package DesignPattern;

public abstract class DocumentFactory {

    protected static Document create(String fileType){
        switch(fileType){
            case "rar":
                return new RarDocs();
            case "zip":
                return new ZipDocs();
            case "tar":
                return new TarDocs();
        }
        return null;
    }

    public static Document get(String fileType){
        return create(fileType);
    }
    
}
