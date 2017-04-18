import java.util.*;
class SampleP4{
    public static void main(String[] args) {
        System.out.println("整数を２つ入力してください");

        Scanner scan = new Scanner(System.in);
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();

        int ans = Math.min(num1, num2);
        System.out.println(num1 + "と" + num2 + "の小さいほうは" + ans);
    }
}
