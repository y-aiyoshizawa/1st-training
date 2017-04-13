import java.util.*;
class Sample9{
    public static void main(String[] args) {
        System.out.println("テストの受験者数を入力してください");
        Scanner scan = new Scanner(System.in);

        int num = scan.nextInt();

        int[] test;
        test = new int[num];

        System.out.println("人数分の点数を入力してください");

        for(int i = 0; i < num; i++){
            test[i] = scan.nextInt();
        }

        System.out.println("ソートします。");
        for(int i = 0; i < test.length - 1; i++){
            for(int j = i + 1; j < test.length; j++){
                if(test[i] > test[j]){
                    int temp = test[i];
                    test[i] = test[j];
                    test[j] =  temp;
                }
            }
        }

        for(int i = 0; i < num; i++){
            System.out.println((i + 1) + "番目の点数:"+test[i]);
        }
    }
}
