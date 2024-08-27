package B1_Introduction_java.thuchanh;

import java.util.Scanner;

public class baitap2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap so tien don gia Usd ");
        float money = sc.nextFloat();
        System.out.println("So tien quy doi ra viet nam dong " + money * 23000);
    }
}
