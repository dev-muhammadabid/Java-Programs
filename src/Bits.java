import java.util.*;

public class Bits {
    public static void main(String[] args){
        System.out.println("Bit Manipulation");
    }
}


/*
Get Bit
Ques.1 Get the 3 bit (position = 2) of a number n. ( n = 0101)
Bit Mask : 1 << i
Operation : AND

        int num = 5; // Binary Conversion 0101
        int position = 2; // If position is 3 the answer should be Zero.
        int bitMask = 1 << position;

        if((bitMask & num) == 0){
            System.out.println("Bit was Zero");
        }else {
            System.out.println("Bit was One");
        }
*/


/*
Set Bit
Ques.2 Set the 2 bit (position = 1) of a number n. ( n = 0101)
Bit Mask : 1 << i
Operation : OR

   int num = 5; // Binary Conversion 0101
        int position = 1;
        int bitMask = 1 << position;

        int newNum = bitMask | num;
        System.out.println(newNum);
*/


/*
Clear Bit
Ques.3 Clear the 3 bit (position = 2) of a number n. ( n = 0101)
Bit Mask : 1 << i
Operation : AND with NOT

  int num = 5; // Binary Conversion 0101
        int position = 2;
        int bitMask = 1 << position;
        int notBitMask = ~(bitMask);

        int newNum = notBitMask & num;
        System.out.println(newNum);
*/


/*
Update Bit
Ques.4 Update the 2 bit (position = 1) of a number n to 1. ( n = 0101)
For 1
Bit Mask : 1 << i
Operation : AND with NOT
For 0
Bit Mask : 1 << i
Operation : OR

 int num = 5; // Binary Conversion 0101
        int position = 1;
        int operation = 0; //Update Bit to 1 else Update Bit to 0.
        int bitMask = 1 << position;

        if (operation == 1){
            int newNumber = bitMask | num;
            System.out.println(newNumber);
        }else {
            int newBitMask = ~(bitMask);
            int newNum = newBitMask & num;
            System.out.println(newNum);
        }
*/