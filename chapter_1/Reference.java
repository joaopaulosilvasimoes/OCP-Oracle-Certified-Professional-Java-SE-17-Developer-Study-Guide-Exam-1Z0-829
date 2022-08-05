package chapter_1;

public class Reference {
 
    String greeting = new String("How are you?");

    // Wrappers Class.
    
    // static, <reference>.valueOf(String, char, or numeric primitive) -> return reference value.
    // static, <reference>.parse<Primitive>(String) -> return primitive value.
    // not static, objectInstance.<primitive>Value() -> return primitive value.

    // boolean
    static Boolean booleanWrapper;

    // byte
    static Byte byteWrapper;

    // short
    static Short shortWrapper;

    // int
    static Integer integerWrapper;

    // int
    static Long longWrapper;

    // float
    static Float floatWrapper;

    // double
    static Double doubleWrapper;

    // char
    static Character characterWrapper;

    public static void main(String[] args){

        Reference reference = new Reference();

        System.out.println(reference.greeting);

        // 
        System.out.println(booleanWrapper);

        System.out.println(byteWrapper);

        System.out.println(shortWrapper);

        System.out.println(integerWrapper);

        System.out.println(longWrapper);

        System.out.println(floatWrapper);

        System.out.println(doubleWrapper);

        System.out.println(characterWrapper);

        //
        booleanWrapper = Boolean.valueOf(true);

        byteWrapper = Byte.valueOf((byte) 1);

        shortWrapper = Short.valueOf((short) 1);

        integerWrapper = Integer.valueOf(1);

        longWrapper = Long.valueOf(1L);

        floatWrapper = Float.valueOf(1.1f);

        doubleWrapper = Double.valueOf(2.2);

        characterWrapper = Character.valueOf('c');

        //
        System.out.println(booleanWrapper);

        System.out.println(byteWrapper);

        System.out.println(shortWrapper);

        System.out.println(integerWrapper);

        System.out.println(longWrapper);

        System.out.println(floatWrapper);

        System.out.println(doubleWrapper);

        System.out.println(characterWrapper);        

        // All of the numeric classes extends the Number class "<primitive>Value()"
        Double apple = Double.valueOf("200.99");

        System.out.println(apple.byteValue());

        System.out.println(apple.shortValue());

        System.out.println(apple.intValue());

        System.out.println(apple.longValue());

        System.out.println(apple.floatValue());

        System.out.println(apple.doubleValue());

        // boolean an character classes "<primitive>Value()"
        Boolean isApple = Boolean.valueOf("true");

        System.out.println(isApple.booleanValue());

        Character characterApple = Character.valueOf('a');

        System.out.println(characterApple.charValue());

    }

}
