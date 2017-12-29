package com.study.sorting;

import java.util.Random;
import java.util.Arrays;

public abstract class AbstractSort {

    protected int arr[];
    protected int size;

    public AbstractSort(int s) {
        size = s;
        arr = new int[size];

    } 

    public void swap(int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    } 

    public void fillRandom () { 
        Random rnd = new Random();
        for (int i = 0; i < size; i++) {
            int num = Math.abs((int) Math.ceil(Math.random()) * rnd.nextInt(500));
            arr[i] = num;
        }
    }

    public abstract void sort();

    public int[] getArr() {
        return arr;
    }

    public void print() {
        System.out.println(Arrays.toString(arr));
    } 
} 