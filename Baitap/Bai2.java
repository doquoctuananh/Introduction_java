package Loop.Baitap;

public class Bai2 {
    public static void main(String[] args) {
        int count=0;
        System.out.println("20 so nguyen to dau tien la");
        for (int i =2;;i++){
            int x=0;
            for(int j = 1; j<= i/2;j++){
                if(i%j == 0){
                    x++;
                }
                if(x==2) break;
            }
            if (x<2) {
                System.out.println(i);
                count++;
            }
            if(count>20) break;
        }
    }
}
