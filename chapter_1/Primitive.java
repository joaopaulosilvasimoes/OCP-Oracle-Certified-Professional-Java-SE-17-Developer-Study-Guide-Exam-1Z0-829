package chapter_1;

public class Primitive {

    // Declarations - Primitive - Defaults.
    static boolean booleanPrimitive; // A common question among newer Java developers is, what is the bit size of boolean? The answer is, it is not specified and is dependent on the JVM where the code is being executed.

    static byte bytePrimitive; // 8 bit

    static short shortPrimitive; // 16 bit -  short is signed (which means it splits its range across the positive and negative integers).

    static int intPrimitive; // 32 bit

    static long longPrimitive; // 64 bit

    static float floatPrimitive; // 32 bit

    static double doublePrimitive; // 64 bit

    static char charPrimitive; // 16 bit - char is unsigned, which means its range is strictly positive, including 0

    // Declarations - Primitive - Literal.
    static boolean booleanPrimitiveLiteral = true; 

    static byte bytePrimitiveLiteral = 1;

    static short shortPrimitiveLiteral = 2; 

    static int intPrimitiveLiteral = 3; 

    static long longPrimitiveLiteral = 4;

    static float floatPrimitiveLiteral = 5; 

    static double doublePrimitiveLiteral = 6; 

    static char charPrimitiveLiteral = 'A';

    // Declarations - Primitive - Literal - Misc.
    static int million1 = 1000000; 
    static int million2 = 2_000_000;

    static int octal = 017; // Octal (digits 0–7), which uses the number 0 as a prefix— for example, 017.
    static int hexadecimal = 0xFF; // Hexadecimal (digits 0–9 and letters A–F/a–f), which uses 0x or 0X as a prefix— for example, 0xFF, 0xff, 0XFf. Hexadecimal is case insensitive, so all of these examples mean the same value.
    static int binary = 0b10; // Binary (digits 0–1), which uses the number 0 followed by b or B as a prefix— for example, 0b10, 0B10.

    //double notAtStart = _1000.00;          // DOES NOT COMPILE 
    //double notAtEnd = 1000.00_;            // DOES NOT COMPILE 
    //double notByDecimal = 1000_.00;        // DOES NOT COMPILE 
    static double annoyingButLegal = 1_00_0.0_0;  // Ugly, but compiles 
    static double reallyUgly = 1__________2;      // Also compiles   

    public static void main(String[] args){

        // Prints.
        System.out.println("Primitive - Defaults");

        System.out.println(booleanPrimitive);

        System.out.println(bytePrimitive);

        System.out.println(shortPrimitive);

        System.out.println(intPrimitive);

        System.out.println(longPrimitive);

        System.out.println(floatPrimitive);

        System.out.println(doublePrimitive);

        System.out.println(charPrimitive);

        System.out.println("Primitive - Literal");   
        
        System.out.println(booleanPrimitiveLiteral);

        System.out.println(bytePrimitiveLiteral);

        System.out.println(shortPrimitiveLiteral);

        System.out.println(intPrimitiveLiteral);

        System.out.println(longPrimitiveLiteral);

        System.out.println(floatPrimitiveLiteral);

        System.out.println(doublePrimitiveLiteral);

        System.out.println(charPrimitiveLiteral);    
        
        System.out.println("Primitive - Literal - Misc "); 

        System.out.println(million1); 

        System.out.println(million2); 

        System.out.println(octal);

        System.out.println(hexadecimal);

        System.out.println(binary);

        System.out.println(annoyingButLegal); 

        System.out.println(reallyUgly); 

    }

}
