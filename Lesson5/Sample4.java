import java.util.*;
class Sample4{
    public static void main(String[] args) {
        System.out.println("整数を入力してください。");
        Scanner scan = new Scanner(System.in);

        int res = scan.nextInt();

        if(res == 1){
            System.out.println("1が入力されました。");
        }else if(res == 2){
            System.out.println("2が入力されました。");
        }else{
            System.out.println("1か2を入力してください。");
        }
    }
}
