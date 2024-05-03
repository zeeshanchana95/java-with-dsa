import java.util.Scanner;

public class Main {

    //1. Enter 3 numbers from the user & make a function to print their values.
    public static void printAverage(int a, int b, int c) {
        float avg = (float) (a + b + c) / 3;
        System.out.println("Average of 3 Numbers is : " + avg);
        return;
    }

    //2. Write a function to print the sum of all odd numbers from 1 to n
    public static void printSumOfOddNumbers(int n) {
        int sum = 0;
        for(int i=1; i<=n; i++) {
            if(i % 2 == 1) {
                sum += i;
            }
        }
        System.out.println("Sum of odd numbers from 1 to " + n + " is : " + sum);
    }

    //3. write a function which takes in 2 numbers and returns greater of those two.
    public static void tellMeGreater(int a, int b) {
       if(a != b) {
           if(a > b) {
               System.out.println(a + " is greater than " + b);
           } else {
               System.out.println(b + " is greater than " + a);
           }
       }
    }


    //4. Write a function that takes in the radius as input and returns the circumference of a circle.
    public static void getCircumferenceOfCircle(float r) {
        float cirOfCircle = (float )(2 * 3.142 * r);
        System.out.println("Circumference of Circle is: " + cirOfCircle);
    }

    //5. Write a function that takes in age as input and returns if that person is eligible to vote or not. A person of age > 18 is eligible to vote.
    public static void isEligibleToVote(int age) {
        if(age > 18) {
            System.out.println("You are eligible to vote");
        } else {
            System.out.println("You are not eligible to vote");
        }
    }


    //6. Write an infinite loop using do while condition.
    public static void infiniteWhileLoop(){
        while(true){
            System.out.println("Hello");
        }
    }

    //7. Write a program to enter the numbers till the user wants and at the end it should display the count of positive, negative and zeros entered.
    public static void tellPositiveNegativeZeroNumbers() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter how many numbers you want to enter: ");
        int n = sc.nextInt();

        int positiveCount=0, negativeCount=0, zeroCount=0;
        int counter = 0;
        int num;

        do {
            System.out.println("Enter number " + (counter+1));
            num = sc.nextInt();
            if(num == 0) {
                zeroCount++;
            } else if(num > 0) {
                positiveCount++;
            } else {
                negativeCount++;
            }
            counter++;
        }
        while(counter != n);

        System.out.println("Total Number of Positive Count: " + positiveCount);
        System.out.println("Total Number of Negative Count: " + negativeCount);
        System.out.println("Total Number of Zeros Count: " + zeroCount);
    }

    //Two numbers are entered by the user, x and n. Write a function to find the value of one number raised to the power of another i.e. 𝑥^𝑛.
    public static void power(int num, int pow) {
        int power = num;
        for(int i=2; i<=pow; i++) {
            power =  power * num;
        }
        System.out.println(num + "^" + pow + " = " + power);
    }

    //  Write a program to print Fibonacci series of n terms where n is input by user : 0 1 1 2 3 5 8 13 21 ..... In the Fibonacci series, a number is the sum of the previous 2 numbers that came before it.(BONUS)
    public static void printFibonacciSeries(int n) {
        if(n == 1) {
            System.out.println("0");
        }
        else if(n == 2) {
            System.out.println("0 1");
        } else {
            System.out.print("0 1");
            int num1 = 0;
            int num2 = 1;
            int num3 = 0;
            for (int i = 1; i <= n - 2; i++) {
                num3 = num1+num2;
                System.out.print(" " + num3);
                num1 = num2;
                num2 = num3;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        int a = sc.nextInt();
//        int b = sc.nextInt();
//        int c = sc.nextInt();
//        printAverage(a, b, c);

//        int n = sc.nextInt();
//        printSumOfOddNumbers(n);

//            int a = sc.nextInt();
//            int b = sc.nextInt();
//            tellMeGreater(a, b);

//        float r = sc.nextFloat();
//        getCircumferenceOfCircle(r);

//        int age = sc.nextInt();
//        isEligibleToVote(age);

//        infiniteWhileLoop();

//        tellPositiveNegativeZeroNumbers();

//          int num = sc.nextInt();
//          int pow = sc.nextInt();
//          power(num, pow);

        int n = sc.nextInt();
        printFibonacciSeries(n);
    }
}