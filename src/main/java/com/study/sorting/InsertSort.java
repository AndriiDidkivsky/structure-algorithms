package com.study.sorting;

public class InsertSort extends AbstractSort {
    public InsertSort(int size) {
        super(size);
    } 

    @Override
    public void sort() {
        int i;
        int key;
        for(int j = 1; j < size; j++) {
            key = arr[j];
            i = j - 1;
            while(i >= 0 && arr[i] > key) {
                arr[i + 1] = arr[i];
                i = i - 1;
            }
            arr[i + 1] = key;
        }
    }
} 