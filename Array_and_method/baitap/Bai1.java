package Array_and_method.baitap;

import java.sql.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Bai1 {
     public static void deleteValue(int[] arr, int valueDelete){
        boolean findValue = false;
        int index=0;
         int arr2[] = new int [arr.length-1];
        for (int i = 0; i < arr.length; i++) {
            if(valueDelete == arr[i]){
                findValue = true;
                index = i;
            }
        }
        if(findValue){

            for (int i = index; i < arr.length-1; i++) {
                arr[i]=arr[i+1];
            }
            for (int i = 0; i < arr2.length; i++) {
                arr2[i]= arr[i];
            }
            System.out.println(Arrays.toString(arr2));
        }
        else{
            System.out.println("khong ton tai gia tri xoa trong mang");
        }

    }

    public static void main(String[] args) {
        int array[] = {1,5,3,8,10};

        deleteValue(array,13);
    }
}
