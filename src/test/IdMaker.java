package test;

public class IdMaker {
    private static int id=-1;
    public static int getId(){
        id++;
        return id;
    }
}
