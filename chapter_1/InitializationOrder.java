package chapter_1;

public class InitializationOrder {
    
    //Can have many Instance Initializer, order they appear.

    //Code blocks appear outside a method. These are called instance initializers.
    {
        //System.out.println(nameVariable); // Cannot reference a field before it is defined
    }

    //Variable.
    String nameVariable;

    //Constructor.
    public InitializationOrder()
    {
        System.out.println("Code Block Construtor Run");
    }

    //Code blocks appear outside a method. These are called instance initializers.
    {
        System.out.println("Code Block Instance Initializer");
    }

    //Run method.
    public static void main(String[] args){

        //The constructor runs after all fields and instance initializer blocks have run.
        InitializationOrder initializationOrder = new InitializationOrder();

    }

}
