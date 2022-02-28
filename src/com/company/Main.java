package com.company;

public class Main {

    public static void main(String[] args) {

    }
}
//Задание 1
//Complete the function that takes a non-negative integer n as input,
//and returns a list of all the powers of 2 with the exponent ranging from 0 to n (inclusive).
class Kata{
    public static long[] powersOfTwo(int n){
        long[] res = new long[n+1];
        for (int i=0;i<=n;i++){
            res[i]=(long)Math.pow(2,i);
        }
        return res;
    }
}
//Задание 2
//Create a function that checks if a number n is divisible by two numbers x AND y.
// All inputs are positive, non-zero digits.
class DivisibleNb {
    public static boolean isDivisible(long n, long x, long y) {
        if((n%x==0) && (n%y==0)){
            return true;
        }
        else{
            return false;
        }
    }
}