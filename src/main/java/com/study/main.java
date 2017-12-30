package com.study;
import com.study.sorting.*;

class Main {
    public static void main(String[] args) {
        InsertSort s1 = new InsertSort(30);
        s1.fillRandom();
        s1.print();
        s1.sort();
        s1.print();

        MergeSort s2 = new MergeSort(30);
        s2.fillRandom();
        s2.print();
        s2.sort();
        s2.print();
    } 
} 