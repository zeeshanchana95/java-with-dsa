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

        int n = 1;
        printNumbersInSequence(n);
    }
}
