import java.util.*;
class Sample8{
    public static void main(String[] args) {
        System.out.println("何番目のコースにしますか？");
        System.out.println("整数を入力してください。");

        Scanner scan = new Scanner(System.in);

        int res = scan.nextInt();

        char ans = (res == 1) ? 'A':'B';
        /*
        char ans = '';
        if(res == 1){
            ans = 'A';
        }else{
            ans = 'B';
        }
        と同じ
        */

        System.out.println(ans + "コースを選択しました。");
    }
}
