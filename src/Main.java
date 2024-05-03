import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //pattern questions
        int rows = 4;
        int cols = 5;
        for(int i = 1; i<= rows; i++) {
            for(int j = 1; j <= cols; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}