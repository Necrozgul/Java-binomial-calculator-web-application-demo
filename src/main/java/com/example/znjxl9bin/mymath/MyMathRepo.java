package com.example.znjxl9bin.mymath;

import java.util.ArrayList;

public class MyMathRepo {
    private static MyMathRepo self;
    private ArrayList<MyMath> mms;

    public MyMathRepo() {
        mms = new ArrayList<>();
    }

    public static MyMathRepo getInstance() {
        if(self == null)
        {
            self = new MyMathRepo();
        }
        return self;
    }

    public ArrayList<MyMath> getMatsh() {
        return mms;
    }

    public void addMath(MyMath u) {
        mms.add(u);
    }



}