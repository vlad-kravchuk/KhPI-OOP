package laba7;

public class laba7 {
    public static void main(String[] args) {
        Container contains = new Container();
        Directory rec1 = new Directory();
        Directory rec2 = new Directory();
        rec1.generateDirectory();
        contains.add(rec1);
        rec2.generateDirectory();
        contains.add(rec2);
        contains.show();
    }
} 
