package chapter_1;

public class StringSandBox {
    
    
    public static void main(String[] args){
    
        // Escape Character
        String escapeCharacter = "\"Java Study Guide\" \n by Scott & Jeanne ";

        System.out.println(escapeCharacter);

        // Multiline String - JAVA 13 - Incidental whitespace and Essential whitespace
        String multilineString = """
                "Java Study Guide"
                by Scott & Jeanne
                """;

        System.out.println(multilineString);

        String pyramid = """
          *
         **
        ***
        """;

        System.out.println(pyramid);

        // 
        //String block1 = """doe"""; // DOES NOT COMPILE
        //System.out.println(block1);

        String block2 = """
                doe \
                deer""";
        System.out.println(block2);

        String block3 = """
                doe \n
                deer""";
        System.out.println(block3);

        String block4 = """
                "doe\"\"\"
                \"deer\"""
                """;
        System.out.println("*" + block4 + "*");

    }

}
