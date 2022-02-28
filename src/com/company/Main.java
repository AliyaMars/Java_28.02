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
//