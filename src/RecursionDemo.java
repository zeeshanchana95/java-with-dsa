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

    public static void printSum(int i, int n, int sum) {
        if(i==n){
            sum +=i;
            System.out.println(sum);
            return;
        }
        sum += i;
        printSum(i+1, n, sum);
    }

    public static void main(String[] args) {

//        int n = 5;
//        printNumbers(n);

//        int n = 1;
//        printNumbersInSequence(n);

        int n = 5;
        int ans = calcFactorial(n);
        System.out.println(ans);
    }
}
