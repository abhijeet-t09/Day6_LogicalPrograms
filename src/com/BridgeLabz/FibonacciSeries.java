package com.BridgeLabz;
import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n1 = 0, n2 = 1;
        System.out.println("Enter Limit of Series::");
        int n = in.nextInt();

        for (int i = 1; i <= n; ++i) {
            System.out.print(n1 + ", ");

            int n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
        }
    }
}
