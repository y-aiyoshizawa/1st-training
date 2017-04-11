import java.util.*;
class Sample3{
    public static void main(String[] args) {
        System.out.println("整数を入力してください。");
        Scanner scan = new Scanner(System.in);

        int res = scan.nextInt();

        if(res == 1){
            System.out.println("1が入力されました。");
        }else{
            System.out.println("1以外が入力されました。");
        }
    }
}
