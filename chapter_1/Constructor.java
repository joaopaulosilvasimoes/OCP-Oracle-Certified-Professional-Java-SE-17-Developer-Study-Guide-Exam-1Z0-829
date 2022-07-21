package chapter_1;

public class Constructor {
    
    //
    String nameVariable;

    // There are two key points to note about the constructor: the name of the constructor matches the name of the class, and there’s no return type.
    public Constructor(){

        //Initialize a variable.
        nameVariable = "John";

        //
        System.out.println("Empty constructor");

    }

    // Not a constructor - Return Type Void, just a method.
    public void Constructor(){

        System.out.println("Is not a constructor");
    
    }

    // Run method.
    public static void main(String[] args)
    {

        Constructor c = new Constructor();

        c.Constructor();

        System.out.println(c.nameVariable);

    }

}
