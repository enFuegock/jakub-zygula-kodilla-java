package com.kodilla.fibonacci;

class FibonacciSequence {

    public static void main(String[] args) {
        int x = CalNthFibSeq(15);
        System.out.println("wynik dla 15: "+ x);
        int a = CalNthFibSeq(21);
        System.out.println("wynik dla 21: "+ a);
    }

    public static int CalNthFibSeq(int n) {
        int[] fibSeqN = new int[n+1];
        fibSeqN[0] = 0;
        fibSeqN[1] = 1;
        for (int i = 2; i <= n; i++) {

            fibSeqN[i] = fibSeqN[i - 1] + fibSeqN[i - 2];
        }
        return fibSeqN[n];
    }
}
