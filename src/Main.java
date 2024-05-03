import java.util.Scanner;

public class Main {

    //1. Enter 3 numbers from the user & make a function to print their values.

    public static void printAverage(int a, int b, int c) {
        float avg = (float) (a + b + c) / 3;
        System.out.println("Average of 3 Numbers is : " + avg);
        return;
    }

    public static void printSumOfOddNumbers(int n) {
        int sum = 0;
        for(int i=1; i<=n; i++) {
            if(i % 2 == 1) {
                sum += i;
            }
        }
        System.out.println("Sum of odd numbers from 1 to " + n + " is : " + sum);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        int a = sc.nextInt();
//        int b = sc.nextInt();
//        int c = sc.nextInt();
//        printAverage(a, b, c);

        int n = sc.nextInt();
        printSumOfOddNumbers(n);
    }
}