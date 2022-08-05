package chapter_1;

public class DeclaringInitializingVariable {


    //Instance and class variables do not require you to initialize them. As soon as you declare these variables, they are given a default value. The compiler doesn’t know what value to use and so wants the simplest value it can give the type: null for an object, zero for the numeric types, and false for a boolean. 
    boolean b1, b2; // VALID - doesn’t initialize either variable
    String s1 = "1", s2; // VALID - doesn’t initialize either variable
    //double d1, double d2; // ERROR -  not legal. Java does not allow you to declare two different types in the same statement. Wait a minute! Variables d1 and d2 are the same type. They are both of type double. Although that’s true, it still isn’t allowed. 
    int i1; int i2; // VALID - Strange but valid
    //int i3; i4; // INVALID - not a valid declaration because it omits the type
    static char c; // You don’t need to know the default value for char, but in case you are curious, it is '\u0000' (NUL).
    //var test; // INVALID - Just local variable. 

    public static void main(String[] args){

        System.out.println(c);

        // Identifiers must begin with a letter, a currency symbol, or a _ symbol. Currency symbols include dollar ($), yuan (¥), euro (€), and so on.
        // Identifiers can include numbers but not start with them.
        // Identifiers can include numbers but not start with them.
        // You cannot use the same name as a Java reserved word. A reserved word is a special word that Java has held aside so that you are not allowed to use it. Remember that Java is case sensitive, so you can use versions of the keywords that only differ in case. Please don’t, though.

        // Valid declarations.
        long okidentifier;
        float $OK2Identifier;
        boolean _alsoOK1d3ntifi3r;
        char __SStillOkbutKnotsonice$;

        // Invalid declarations.
        //int 3DPointClass;    // identifiers cannot begin with a number 
        //byte hollywood@vine; // @ is not a letter, digit, $ or _ 
        //String *$coffee;     // * is not a letter, digit, $ or _ 
        //double public;       // public is a reserved word 
        //short _;             // a single underscore is not allowed

        // Declaring Multiples Variables.
        String s1, s2; // Not initialized.
        String s3 = "yes", s4 = "no"; // Initialized - inline.

        //System.out.println(s1); // ERRO - Local variable not initialized.
        //System.out.println(s2); // ERRO - Local variable not initialized.
        System.out.println(s3);
        System.out.println(s4);

        int i1, i2, i3 = 0; // Just last is initialized.

        //System.out.println(i1); // ERRO - Local variable not initialized.
        //System.out.println(i2); // ERRO - Local variable not initialized.
        System.out.println(i3);

        //int num, String value; // DOES NOT COMPILE - This code doesn’t compile because it tries to declare multiple variables of different types in the same statement.
        int num; String value; // COMPILE - semicolon instead comma.

        // Inferring the Type with var
        var name = "Hello";
        var size = 7;

        System.out.println(name);
        System.out.println(size);

        var number = 7; // When you type var, you are instructing the compiler to determine the type for you. The compiler looks at the code on the line of the declaration and uses it to infer the type. 
        number = 4;
        //number = "Name"; // INVALID - is a int, because they declaration.

        var testVar =
        8; // VALID.

        String testeString = 
            "TESTE"; // VALID.

        //var a; // INVALID - The initial value used to determine the type needs to be part of the same statement. 

        //var n = null; // INVALID - The compiler is being asked to infer the type of null. This could be any reference type. The only choice the compiler could make is Object. 

        var s = new String();

    }

    public void localVariable(){

        // Final Local Variable.
        final int y = 10;

        int x = 20;

        //y = x + 10; // DOES NOT COMPILE - The final keyword can be applied to local variables and is equivalent to declaring constants in other languages.

        final int[] favoriteNumbers  = new int[10];

        favoriteNumbers[0] = 1;
        favoriteNumbers[1] = 2;

        //favoriteNumbers = null; // DOES NOT COMPILE - The final modifier can also be applied to local variable references.

        // Uninitialized Local Variable.
        int a = 10;

        int b;

        //int c = a + b; // DOES NOT COMPILE - Local variable declared and not initilized cannot be used.

        int z; // VALID - Declared, not initialized, but dont used.


    }
 
    // 
    public static void findAnswer(boolean check){

        //
        int answer;   
        int otherAnswer;   
        int onlyOneBranch;  
        
        if (check) { 
            onlyOneBranch = 1; // Just here initilized
            answer = 1;  // Initialized
        } else { 
            answer = 2;  // initialized
        }   
        
        System.out.println(answer);   
        //System.out.println(onlyOneBranch);  // DOES NOT COMPILE - The onlyOneBranch variable is initialized only if check happens to be true. The compiler knows there is the possibility for check to be false

    }    

    public static void checkAnswer(){

        boolean value;

        //DeclaringInitializingVariable.findAnswer(value); // DOES NOT COMPPILE - The call to findAnswer() does not compile because it tries to use a variable that is not initialized.

    }

    //public static void varParamVariable(var a, var b){  } // INVALID - In this example, a and b are method parameters. These are not local variables.

}

/*
 * Believe it or not, this code does compile. Java is case sensitive, so Var doesn’t introduce any conflicts as a class name. Naming a local variable var is legal. Please don’t write code that looks like this at your job! But understanding why it works will help get you ready for any tricky exam questions the exam creators could throw at you.
 */
class Var {   

    public void var() {      
        var var = "var";   
    }   
    
    public void Var() {      
        Var var = new Var();   
    } 
}