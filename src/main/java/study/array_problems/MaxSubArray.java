package study.array_problems;


public class MaxSubArray { 
   
    public int findMaxCrossingSubArray(int arr[], int low, int mid, int high) {
        int leftSum = Integer.MIN_VALUE;
        int rightSum = Integer.MIN_VALUE;
        int sum = 0;

        for(int i = mid; i >= low; i--) {
            sum = sum + arr[i];
            if(sum > leftSum) {
                leftSum = sum;
            } 
        } 
        sum = 0;

        for(int j = mid + 1; j <= high; j++) {
            sum = sum + arr[j];
            if(sum > rightSum) {
                rightSum = sum;
            } 
        }
        
        return leftSum + rightSum;
    } 

    public int findMaxSubArray (int arr[], int low, int high) {
        if(high == low) {
            return arr[low];
        } else {
            int mid = (int) Math.floor((low + high) / 2);
            int leftSum = findMaxSubArray(arr, low, mid);
            int rightSum = findMaxSubArray(arr, mid + 1, high);
            int crossSum = findMaxCrossingSubArray(arr, low, mid, high);

            if(leftSum >= rightSum && leftSum >= crossSum) {
                return leftSum;
            } else if(rightSum >= leftSum && rightSum >= crossSum) {
                return rightSum;
            } else {
                return crossSum;
            } 
        } 
    } 
}