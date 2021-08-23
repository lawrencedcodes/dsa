import java.util.Scanner;

public class Strings{

    void runStrings () {

        String greeting = "hello";
        String name = "Lawrence";
        String together = greeting + " " + name;
        String smashed = greeting.concat(name);
        System.out.println(greeting + " and " + together);
        System.out.println(smashed);
        System.out.println("The second letter in the greeting is " + greeting.charAt(1));
        System.out.println("The length of the string is " + greeting.length());
        System.out.println("Index of the o is: " + greeting.indexOf("o"));
        System.out.println("uppercase: " + greeting.toUpperCase() + " and lowercase: " + greeting.toLowerCase());
        System.out.println("\\n is for new line.  \\r is for carriage return. \\t is for tab.  \\b is for backspace.  \\f is for form feed  ");

        String string1, string2;
        Scanner scn = new Scanner(System.in);
        System.out.println("Input a letter");
        string1 = scn.nextLine();
        System.out.println(string1);
    }
}