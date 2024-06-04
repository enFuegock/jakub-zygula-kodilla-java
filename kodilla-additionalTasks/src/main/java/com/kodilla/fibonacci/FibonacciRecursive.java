package com.kodilla.fibonacci;

public class FibonacciRecursive {
    public static void main(String[] args) {
        int x = FibSeqRec(15);
        System.out.println("wynik dla 15: " + x);
        int a = FibSeqRec(21);
        System.out.println("wynik dla 21: " + a);
        int y = FibSeqRec(0);
        System.out.println("wynik dla 0: " + y);
        int b = FibSeqRec(1);
        System.out.println("wynik dla 1: " + b);
        int c = FibSeqRec(2);
        System.out.println("wynik dla 2: " + c);
        int d = FibSeqRec(3);
        System.out.println("wynik dla 3: " + d);
    }

    public static int FibSeqRec(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return FibSeqRec(n - 1) + FibSeqRec(n - 2);
        }
    }
}

