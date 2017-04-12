import java.util.*;

class Sample4{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("1からnまでの合計を求めます");
        System.out.println("nを入力してください。");
        int n = scan.nextInt();

        int sum = 0;
        for(int i = 1; i <= n; i++){
            sum += i;
        }
        System.out.println("1から"+n+"の合計:"+sum);
    }
}
