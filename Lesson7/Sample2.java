import java.util.*;
class Sample2{
    public static void main(String[] args) {
        System.out.println("テストの受験者数を入力してください");
        Scanner scan = new Scanner(System.in);

        int num = scan.nextInt();

        int[] test;
        test = new int[num];

        System.out.println("人数分の点数を入力してください");

        for(int i = 0; i < num; i++){
            System.out.print((i + 1)+"人目:");
            test[i] = scan.nextInt();
        }

        for(int i = 0; i < num; i++){
            System.out.println((i + 1) + "番目の点数:"+test[i]);
        }
    }
}
