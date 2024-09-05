package Array_and_method.baitap;

import java.util.Scanner;

public class bai5 {
    public static void minArray(int arr[]){
        int min =arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(min>arr[i]){
                min = arr[i];
            }
        }
        System.out.println("Min trong mang la " + min);
    }

    public static void main(String[] args) {
        int size;
        Scanner sc = new Scanner(System.in);
        System.out.println("ban muon nhap mang bao nhieu phan tu ");
        size = Integer.parseInt(sc.nextLine());
        int arr[] = new int[size];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("nhap cac phan tu thu " + (i+1) );
            arr[i] = Integer.parseInt(sc.nextLine());
        }
        minArray((arr));
    }
}
