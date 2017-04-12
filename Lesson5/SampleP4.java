import java.util.*;
class SampleP4{
    public static void main(String[] args) {
        System.out.println("０から１０までの整数を入力してください。");
        Scanner scan = new Scanner(System.in);
        int res = scan.nextInt();
        if(0 <= res && res <= 10){
            System.out.println("正解");
        }else{
            System.out.println("間違い");
        }
    }
}
