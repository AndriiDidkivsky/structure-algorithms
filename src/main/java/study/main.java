package study;
import study.sorting.*;
import study.array_problems.*;

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

        MaxSubArray mas = new MaxSubArray();
        int arr[] = {1,2,3,4,5,6,7, 1, 2, 4, -7};
        int res = mas.findMaxSubArray(arr, 0, 4);
        System.out.println(res);
    } 
} 