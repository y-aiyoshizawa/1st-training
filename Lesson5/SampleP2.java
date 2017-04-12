import java.util.*;

class SampleP2{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("整数を入力してください。");

        int num = scan.nextInt();

        if((num & 0x1) == 0x1){
            System.out.println("奇数です。");
        }else{
            System.out.println("偶数です。");
        }
    }
}
