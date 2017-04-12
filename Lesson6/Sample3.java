import java.util.*;

class Sample3{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("いくつ*を出力しますか？");
        int res = scan.nextInt();
        //for(:繰り返すごとに実行される？:)
        
        for(int i = 0; i < res; i++){
            System.out.print("*");
        }
    }
}
