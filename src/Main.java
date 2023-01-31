import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

Read read= new Read();
LogicalOperations logicalOP= new LogicalOperations();
        int[] myArrayTema = {10, 20, 30, 40, 50};
       System.out.println("ex 1");
        read.readNumber();

        System.out.println("ex 2");
        read.readFloat();
        read.readDouble();
        read.readLong();
        read.readBoolean();
        read.readChar();

        System.out.println("ex 3");
        int[] myArray= read.getNumbersFromKeyboard( 3);
        logicalOP.printArray(myArray);

        System.out.println("ex 4");
        ArrayList<Integer> myList=read.readNumbers();
            System.out.println(myList);

        System.out.println("ex 5");
logicalOP.arrayAccess(myArrayTema,4);

        System.out.println("ex 6");
logicalOP.wait(7);





    }
}