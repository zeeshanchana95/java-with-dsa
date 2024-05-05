import java.util.Scanner;

public class Strings {

    public static void main(String[] args) {
        //String declaration and initialization
//        String name = "Zeeshan";
//        String fullName = "Zeeshan Ahmed";
//        String sentence = "Hi, My name is Zeeshan";

        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println("Your name is: " + name);
    }
}