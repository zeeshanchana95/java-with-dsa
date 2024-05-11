//Recursion in Java
public class RecursionDemo {

    //print numbers from 5 to 1
    public static void printNumbers(int n) {
        if(n == 0)
            return;
        System.out.println(n);
        printNumbers(n-1);
    }

    //print numbers from 1 to 5
    public static void printNumbersInSequence(int n) {
        if(n == 6) {
            return;
        }
        System.out.println(n);
        printNumbersInSequence(n+1);
    }

    public static int calcFactorial(int n) {
        if(n==1 | n==0)
            return 1;
        int fact_nm1 = calcFactorial(n-1);
        int fact_n = n * fact_nm1;
        return fact_n;
    }

    //Q: Print x^n (stack height = n)
    public static int calcPower(int x, int n) {
        if(n==0) {
            return 1;
        }
        if(x == 0) {
            return 0;
        }
        int xPownm1 = calcPower(x, n-1);
        int xPown = x * xPownm1;
        return xPown;
    }

    public static void printSum(int i, int n, int sum) {
        if(i==n){
            sum +=i;
            System.out.println(sum);
            return;
        }
        sum += i;
        printSum(i+1, n, sum);
    }

    //Q: Print fibonacci sequence till nth term.
    public static void printFib(int a, int b, int n) {
       if(n==0) {
           return;
       }
       int c = a+b;
       System.out.println(c);
       printFib(b, c, n-1);
    }

    //Q: calculate x^n.
    public static int calcPower2(int x, int n) {
        if(n==0) {
            return 1;
        }
        if(x==0) {
            return 0;
        }
        if(n%2 == 0) {
            return calcPower2(x,n/2) * calcPower2(x,n/2);
        }
        else {
            return calcPower2(x, n/2) * calcPower2(x, n/2) * x;
        }
    }

    public static void main(String[] args) {

//        int n = 5;
//        printNumbers(n);
//
//        int n = 1;
//        printNumbersInSequence(n);
//
//        int n = 5;
//        int ans = calcFactorial(n);
//        System.out.println(ans);
//
//        int a = 0, b = 1;
//        System.out.println(a);
//        System.out.println(b);
//        int n = 7;
//        printFib(a, b, n-2);

        int x = 2, n = 5;
        int ans = calcPower(x, n); //O(n)
//        int ans = calcPower2(x, n);
        System.out.println(ans);
    }
}
