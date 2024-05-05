import java.util.Scanner;

public class Main {


    //    Question: Take an array as input from the user. Search for a
    //    given number x and print the index at which it occurs.

    public static void getIndex(int[] arr, int num) {
        for(int i=0; i<arr.length; i++){
            if(arr[i] == num) {
                System.out.println("Number found at index " + i);
                return;
            }
        }
        System.out.println("Number not found");
    }

    public static void main(String[] args) {
        int[] numbers = {1,2,3,4};
        getIndex(numbers, 0);
    }
}