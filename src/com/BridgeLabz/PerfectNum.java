package com.BridgeLabz;
import java.util.Scanner;

public class PerfectNum {
    public static void main(String[] args) {

        Scanner in=new Scanner(System.in);
        System.out.print("Enter Number....::");
        long n=in.nextLong();
        long sum=0;

        for(int i=1; i<n; i++)
        {
            if(n % i == 0)
            {
                sum = sum + i;
            }
        }

        if(sum==n)
            System.out.println(n+" is a perfect number.");
        else
            System.out.println(n+" is not a perfect number.");
    }
}
