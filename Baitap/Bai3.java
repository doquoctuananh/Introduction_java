package Loop.Baitap;

public class Bai3 {
    public static void main(String[] args) {
        int count = 0;
        System.out.println("cac so nguyen to nho hon 100");
        for (int i = 2;i<100 ; i++) {
            int x = 0;
            for (int j = 1; j <= i / 2; j++) {
                if (i % j == 0) {
                    x++;
                }
                if (x == 2) break;
            }
            if (x < 2) {
                System.out.println(i);
                count++;
            }

        }
    }
}
