import java.util.*;

class Sample11{
    public static void main(String[] args) {
        System.out.println("何番目の処理を飛ばしますか？");
        Scanner scan = new Scanner(System.in);
        int res = scan.nextInt();

        for(int i = 1; i <= 10; i++){
            if(i == res)continue;
            System.out.println(i + "番目の処理です。");
        }
    }
}
