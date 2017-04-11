import java.util.*;
class Sample2{
    public static void main(String[] args) {
        System.out.println("整数を入力してください。");
        Scanner scan = new Scanner(System.in);

        int res = scan.nextInt();

        if(res == 1){
            System.out.println("1が入力されました。");
            System.out.println("1が選択されました。");
        }

        System.out.println("処理を終了します。");
    }
}
