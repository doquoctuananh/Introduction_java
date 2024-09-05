package Array_and_method.baitap;

import java.util.Arrays;

public class bai3 {
    public static void mergerArray(int arr1[],int arr2[]){
        int arr3[] = new int[arr1.length+arr2.length];
        for (int i = 0; i < arr1.length; i++) {
            arr3[i] = arr1[i];
        }
        for (int i = arr1.length; i <arr3.length ; i++) {
            arr3[i] = arr2[i-arr1.length];
        }
        System.out.println(Arrays.toString(arr3));
    }

    public static void main(String[] args) {
        int arr1[] = {1,10,5};
        int arr2[] = {10, 5, 69};
        mergerArray(arr1,arr2);
    }
}
