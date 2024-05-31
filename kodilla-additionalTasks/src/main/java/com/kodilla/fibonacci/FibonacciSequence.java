package com.kodilla.fibonacci;

import java.util.Scanner;

class FibonacciSequence {

    public static void main(String[] args) {
    }

    public static int CalNthFibSeq(int n){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the value of n:");
        n = input.nextInt();
        int[] fibSeqN = new int[n+1];
        fibSeqN[0] = 0;
        fibSeqN[1] = 1;
        for (int i = 2; i <= n; i++) {
            fibSeqN[i] = fibSeqN[i - 1] + fibSeqN[i - 2];
        }
        return fibSeqN[n];
    }
}
