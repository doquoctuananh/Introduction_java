package Loop.Baitap;

import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        int enter;
        System.out.println("1.In hình chữ nhật");
        System.out.println("2.In hình tam giác vuông, có cạnh góc vuông ở botton-left");
        System.out.println("3.In hình tam giác vuông, có cạnh góc vuông ở top-left ");
        System.out.println("Lua chon loai hinh hien thi ");
        Scanner sc = new Scanner(System.in);
        enter = Integer.parseInt(sc.nextLine());
        switch(enter){
            case(1):
                for (int i=0;i<3;i++){
                    for (int j = 0;j<7;j++){
                        System.out.print("*");
                    }
                    System.out.print("\n");
                }
                break;
            case (2):
                for (int i= 0;i<5;i++){
                    for (int j = 0;j<i+1;j++ ){
                        System.out.print("*");
                    }
                    System.out.print("\n");
                }
                break;
            case(3):
                for (int i= 0;i<5;i++){
                    for (int j = 5-i;j>0;j--){
                        System.out.print("*");
                    }
                    System.out.print("\n");
                }
                break;
            default:
                System.out.println("ban khong chon gi");
        }
    }
}
