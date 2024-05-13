import java.util.*;

public class Strings {
    public static void main(String[] args) {
        System.out.println("Strings Program");


    }
}

    /*
        String firstName = "Abid";
        String lastName = "Zaeem";
    */

    //String fullName = firstName + " " + lastName; // Concatenate

        /*
        LENGTH
        System.out.println(fullName);
        System.out.println(fullName.length()); //Length Function - to know the length of the string.
       */

        /*
        charAt() Function
        for (int i = 0; i < fullName.length(); i++){
            System.out.println(fullName.charAt(i));
        }
        */

        /*
        Substring
        String sentence = "My name is Abid";
        String subS = sentence.substring((11));  //substring( Begin Index, End Index)
        System.out.println(subS);
        */

        /*
        STRINGBUILDER
        StringBuilder sb = new StringBuilder("ABii");
        System.out.println(sb);
        */

        /*
        setCharAt() Function to change the character into the string.
        sb.setCharAt(3, 'd'); // index, char
        System.out.println(sb);
        */

        /*
        INSERT() function
        sb.insert(4, 'd');
        System.out.println(sb);
        */


        /*
        Delete() function
        sb.delete(1,3);
        System.out.println(sb);
        */

        /*
        Append() function
        sb.append(" good night");
        System.out.println(sb);
        */

        /*
        REVERSE
        String str = "Hello, World!";
        StringBuilder reversed = new StringBuilder(str).reverse();
        System.out.println(reversed);
        */