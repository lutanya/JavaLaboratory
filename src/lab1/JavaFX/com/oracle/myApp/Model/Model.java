package com.oracle.myApp.Model;

import java.util.Random;

public class Model {

    Random r = new Random();

    public int getGrettetThan(int number) {
        return Math.abs(r.nextInt()) + number;
    }
    public int getLessThan(int number) {
        return r.nextInt(number);
    }

}
