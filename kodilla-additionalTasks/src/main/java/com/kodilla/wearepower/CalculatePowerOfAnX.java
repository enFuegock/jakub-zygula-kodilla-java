package com.kodilla.wearepower;

class PowerOfX {
    private int a;
    private int n;
    private int result;
    public int powa(int a, int n) {
        result = 1;
        if (n == 0){
            return result;
        } else {
        result = a;
        for(int i=1; i < n; i++){
            result *= a;
        }
            return result;
        }
    }
}


public class CalculatePowerOfAnX {

    public static int powa ( int x, int y){
        int result = 1;
        if (y == 0) {
            return result;
        } else {
            result = x;
            for (int i = 1; i < y; i++) {
                result *= x;
            }
            return result;
        }
    }

    public static void main(String[] args) {
        /*
        PowerOfX s = new PowerOfX();
        System.out.println("2 do 0");
        s.powa(2,0);
        System.out.println("2 do 1");
        s.powa(2,1);
        System.out.println("2 do 8");
        s.powa(2,8);
        System.out.println("3 do 0");
        s.powa(3,0);
        System.out.println("3 do 1");
        s.powa(3,1);
        System.out.println("3 do 3");
        s.powa(3,3);
         */
    }
}