
public class Main {
    public static void main(String[] args) {
        //pattern questions
        int n = 4;
        for(int i = 1; i<= n; i++) {
            for(int j = n; j >= i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}