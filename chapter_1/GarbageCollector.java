package chapter_1;

public class GarbageCollector {

    public static void main(String[] args){

        String[] stringArray = new String[1000];

        for(int i = 0; i< 1000; i++){

            stringArray[i] = new String("Number: " + Integer.valueOf(i).toString(i));

        }

        System.out.print(stringArray.length);

        // Just like the post office, Java is free to ignore you. This method is not guaranteed to do anything.
        System.gc();

        //
        String one, two;

        one = new String("a");

        two = new String("b");

        one = two;

        String threee = one;

        one = null;

    }
    
}
