import java.util.*;

class Sample9{
    public static void main(String[] args) {
        System.out.println("何番目でループを中止させますか？");
        Scanner scan = new Scanner(System.in);
        int res = scan.nextInt();

        for(int i = 1; i <= 10; i++){
            System.out.println(i + "番目の処理です。");
            if(i >= res)break;
        }
    }
}
