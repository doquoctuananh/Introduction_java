package Array_and_method.baitap;

import java.util.Arrays;

public class bai4 {
    public static void maxArray (int arr[][]){
        int arr2[] = new int[arr.length];
        int maxArr2 =arr2[0];
        for (int i = 0; i <arr.length ; i++) {
            int maxRow = arr[i][0];
            for (int j = 0; j < arr[0].length; j++) {
                if(maxRow<arr[i][j]){
                    maxRow = arr[i][j];
                }
            }
            arr2[i]= maxRow;
        }

        for (int i = 0; i < arr2.length; i++) {
            if(maxArr2<arr2[i]){
                maxArr2 = arr2[i];
            }
        }
        System.out.println("So lon nhat trong mang 2 chieu la " +maxArr2);
    }

    public static void main(String[] args) {
        int arr[][] = {{1,2,3},{7,8,9}};
        maxArray(arr);
    }
}
