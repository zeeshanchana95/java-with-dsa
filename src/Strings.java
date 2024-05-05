import java.util.Scanner;

public class Strings {

    public static void main(String[] args) {
        //String functions

        //concatenation
        String firstName = "Zeeshan";
        String lastName = "Ahmed";
        String fullName = firstName + " " + lastName;
        System.out.println(fullName);

        //length
        System.out.println("Length : " + fullName.length());

        //charAt
        for(int i=0; i<fullName.length(); i++) {
            System.out.print(fullName.charAt(i));
        }
        System.out.println();

        //compareTo
            //1. s1 > s2  -> +ve value
            //2. s1 == s2 -> 0 value
            //3. s1 < s2  -> -ve value

        String name1 = "Zeeshan2";
        String name2 = "Zeeshan";
        if(name1.compareTo(name2) == 0) {
            System.out.println("Strings are equal");
        } else {
            if(name1.compareTo(name2) > 0) {
                System.out.println("String1 is greater than String2");
            } else {
                System.out.println("String1 is less than String2");
            }
        }

        if(name1 == name2) {
            System.out.println("Strings are equal");
        } else {
            System.out.println("Strings are not equal");
        }

        if(new String("Zeeshan") == new String("Zeeshan")) {
            System.out.println("Equal");
        } else {
            System.out.println("Not equal");
        }

        //substring
        String sentence = "My name is Zeeshan";
        String newName = sentence.substring(11, sentence.length());
        System.out.println(newName);

        String newString = "ZeeshanAhmed";
        String subStr = newString.substring(0, 7);
        System.out.println(subStr);

        String subStr1 = newString.substring(7);
        System.out.println(subStr1);

    }
}