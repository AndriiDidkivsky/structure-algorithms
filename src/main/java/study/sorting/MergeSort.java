package study.sorting;

import java.nio.Buffer;

public class MergeSort extends AbstractSort { 
    
    public MergeSort(int size) {
        super(size);
    } 


    public void sort() {
        int[] buffer = new int[size];
        mergeSort(buffer, 0, size - 1);
    } 

    private void mergeSort(int buffer[], int left, int right) {
        if(left == right) {
            return;
        }
        
        int middle = (left + right) / 2;

        mergeSort(buffer, left, middle);

        mergeSort(buffer, middle + 1, right);

        merge(buffer, left, middle, right);
    } 


    private void merge(int buffer[], int left, int right, int top) {
        int l = left;
        int r = right + 1;
        int mid = right;
        int i = 0;
        int length = top - left + 1;
    
        while (l <= mid && r <= top) {
            buffer[i++] = arr[l] < arr[r] ? arr[l++] : arr[r++];
        }
        while (l <= mid) {
            buffer[i++] = arr[l++];
        } 
        while (r <= top) {
            buffer[i++] = arr[r++];
        } 

        for(i = 0; i < length; i++) {
            arr[left + i] = buffer[i];
        }
    } 
}