import java.util.*;

class SampleP2{
    public static void main(String[] args) {
        System.out.println("テストの点数を入力してください（0で終了する）");
        Scanner scan = new Scanner(System.in);
        int sum = 0;
        while(true){
            int res = scan.nextInt();
            if(res == 0)break;
            sum += res;
        }
        System.out.println("合計:"+sum);
    }
}
