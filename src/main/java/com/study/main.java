package com.study;
import com.study.sorting.*;

class Main {
    public static void main(String[] args) {
        InsertSort s1 = new InsertSort(20);
        s1.fillRandom();
        s1.print();
        s1.sort();
        s1.print();
    }
} 