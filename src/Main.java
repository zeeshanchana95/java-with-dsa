import java.util.Scanner;

public class Main {

    //1. Enter 3 numbers from the user & make a function to print their values.

    public static void printAverage(int a, int b, int c) {
        float avg = (float) (a + b + c) / 3;
        System.out.println("Average of 3 Numbers is : " + avg);
        return;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        printAverage(a, b, c);
    }
}