package com.BridgeLabz;
import java.util.*;

public class NumReverse {
    public static void main(String[] args) {

        Scanner in=new Scanner(System.in);
        int num=in.nextInt();
        int rev=0;

        while(num != 0) {

            int digit = num % 10;
            rev = (rev * 10) + digit;
            num /= 10;
        }
        System.out.println("Reversed Number: "+rev);
    }
}
