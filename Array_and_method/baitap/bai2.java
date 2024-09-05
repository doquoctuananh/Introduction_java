package Array_and_method.baitap;

import java.util.Arrays;

public class bai2 {
    public static void addValueArray(int arr[], int index, int value){
        int arr2 []= new int[arr.length+1];
        if(index>arr.length || index <0){
            System.out.println("khong the chen gia tri vao mang");
            return;
        }
        else{
            arr2[index] = value;
            for (int i = 0; i < index; i++) {
                arr2[i]= arr[i];
            }
            for (int i = index+1; i < arr2.length; i++) {
                arr2[i]= arr[i-1];
            }
            System.out.println(Arrays.toString((arr2)));
        }

    }

    public static void main(String[] args) {
        int array[] ={1,4,5,20};
        addValueArray(array,4,10);
    }
}
