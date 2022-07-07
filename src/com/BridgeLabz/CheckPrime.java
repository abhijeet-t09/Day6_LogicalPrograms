package com.BridgeLabz;
import java.util.Scanner;

public class CheckPrime {
    static  boolean Prime(int num)
    {
        if(num<=1)
            return false;

        for(int i=2; i<num ;i++)
        {
            if((num%i)==0)
                return  false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number= in.nextInt();

        if(Prime(number)) {
            System.out.println(number + " is prime number");
        }
        else{
            System.out.println(number + " is not a prime number");
        }
    }
}
