package com.example.znjxl9bin.mymath;

import java.util.concurrent.atomic.AtomicInteger;

public class MyMath {
    private static final AtomicInteger count = new AtomicInteger(-1);
    int n;
    int k;
    int eredmeny;
    int calcnumber;

    public MyMath(int n, int k) {
        this.calcnumber = count.incrementAndGet();
        this.n = n;
        this.k = k;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public int getK() {
        return k;
    }

    public void setK(int k) {
        this.k = k;
    }

    public int getCalcnumber() {
        return calcnumber;
    }


    public static int fact(int n)
    {
        int d=1;
        for (int i = n; i > 0; i--) {
            d*=i;
        }
        return d;
    }
    public static int bin (int n, int k){
        int d;
        if (n==0)
            return  0;
        if (n<0||n>15)
            return -1;
        d = fact(n)/(fact(k)*fact(n-k));
        return d;
    }
    public void incraseCalcNumber()
    {
        calcnumber++;
    }

    public int eredmenySzamolo(int n, int k)
    {
        return bin(n,k);
    }
}
