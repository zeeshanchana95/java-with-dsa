import java.util.Scanner;

public class Strings {

    public static void main(String[] args) {
//        Get the 3rd bit (position = 2) of a number n. (n = 0101)
//        Bit Mask :
//        Operation : AND

//       int n = 5; //0101
//       int pos = 3;
//       int bitMask = 1<<pos;
//       if( (bitMask & n) == 0) {
//           System.out.println("bit was 0");
//       } else {
//           System.out.println("bit was 1");
//       }

//        Set the 2nd bit (position = 1) of a number n. (n = 0101)
//        Bit Mask : 1<<i
//        Operation : OR
//        int n = 5; //0101
//        int pos = 1;
//        int bitMask = 1<<pos;
//        int newNumber = bitMask | n;
//        System.out.println(newNumber);



//        Clear Bit
//        Clear the 3rd bit (position = 2) of a number n. (n = 0101)
//        Bit Mask : 1<<i
//        Operation : AND with NOT
//        int n = 5;
//        int pos = 2;
//        int bitMask = 1<<pos;
//        int notBitMask = ~ (bitMask);
//
//        int newNumber = notBitMask & n;
//        System.out.println(newNumber);

//        Update Bit
//        Update the 2nd bit (position = 1) of a number n to 1. (n = 0101)
    //        For I
    //        Bit Mask : 1<<i
    //        Operation : AND
    //        with NOT
    //
    //        For O
    //        Bit Mask :
    //        Operation : OR


        Scanner sc = new Scanner(System.in);
        int oper = sc.nextInt();
        //oper = 1 -> set;  oper = 0 -> clear
        int n = 5; //0101
        int pos = 2;

        int bitMask = 1<<pos;
        if(oper == 1) {
            //set
            int newNumber = bitMask | n;
            System.out.println(newNumber);
        } else {
            //clear
            int newBitMask = ~(bitMask);
            int newNumber = newBitMask & n;
            System.out.println(newNumber);
        }
    }
}