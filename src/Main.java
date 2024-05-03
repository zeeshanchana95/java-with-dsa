import java.util.Scanner;

public class Main {

//    public static int calculateSum(int a, int b) {
//        return a + b;
//    }
//
//    public static int calculateProduct(int a, int b) {
//        return a * b;
//    }

    public static void printFactorial(int n) {
        //loop
        if(n < 0) {
            System.out.println("Invalid number");
            return;
        }
        int factorial = 1;
        for(int i = n; i>=1; i--) {
            factorial = factorial * i;
        }
        System.out.println(factorial);
        return;
    }
    public static void main(String[] args) {
        //functions
        Scanner sc = new Scanner(System.in);

//        int a = sc.nextInt();
//        int b = sc.nextInt();
//       int sum = calculateSum(a, b);
//       System.out.println("Sum of 2 numbers is: " + sum);
//
//       System.out.println("Product of 2 numbers is: " + calculateProduct(a,b));

        int n = sc.nextInt();
        printFactorial(n);

    }
}