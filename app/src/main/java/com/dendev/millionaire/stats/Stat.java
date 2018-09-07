package com.dendev.millionaire.stats;

public class Stat {

    public int change(int prev, int x) {
        if (prev == 0){
            return 0;
        }
        if (prev - x == 0) {
            return 0;
        }
        return x;
    }

}
