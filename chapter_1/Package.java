package chapter_1;

//import java.util.Random;
//import java.util.*;

// Redundant import - There’s one special package in the Java world called  java.lang. This package is special in that it is automatically imported.
import java.lang.System;
import java.lang.*;
import java.util.Random;
import java.util.*;

public class Package {
    
    public static void main (String[] args){

        Random r = new Random();
        
        System.out.println(r.nextInt(10));

    }

}
