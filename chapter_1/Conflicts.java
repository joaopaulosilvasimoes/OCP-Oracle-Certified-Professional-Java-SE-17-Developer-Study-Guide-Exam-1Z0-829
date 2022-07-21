package chapter_1;

//import java.util.*;
//import java.sql.*; // The type Date is ambiguous - causes Date declaration to not compile

//If you explicitly import a class name, it takes precedence over any wildcards present.
import java.util.Date;
import java.sql.*; 

//import java.util.Date;
//import java.sql.Date; // The import java.sql.Date collides with another import statement - causes Date declaration to not compile

public class Conflicts {
    
    public static void main(String... args){

        Date date;

        //Fully qualified class name.
        java.sql.Date sqlDate;

    }

}
