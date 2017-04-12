import java.util.*;
class SampleP3{
    public static void main(String[] args) {

        System.out.println("２つの整数を入力してください");
        Scanner scan = new Scanner(System.in);

        int a = scan.nextInt();
        int b = scan.nextInt();

        if(a == b){
            System.out.println("２つの値は同じです。");
        }else{
            if(a > b){
                int tmp = a;
                a = b;
                b = tmp;
            }
            System.out.println(a + "より" + b + "のほうが大きいです。");
        }

    }
}
