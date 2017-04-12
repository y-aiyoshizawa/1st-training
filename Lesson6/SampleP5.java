import java.util.*;
class SampleP5{
    public static void main(String[] args) {
        System.out.println("２以上の整数を入力してください。");
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();

        if(num >= 2){
            boolean f = true;
            int root = (int)Math.sqrt(num);
            for(int i = 2; i <= root; i++){
                if(num % i == 0){
                    f = false;
                    break;
                }
            }
            if(f){
                System.out.println(num+"は素数です。");
            }else{
                System.out.println(num+"は素数ではありません。");
            }
        }else{
            System.out.println("２以上の整数を入力してください。");
            System.out.println("終了します。");
        }
    }
}

