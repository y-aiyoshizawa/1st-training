import java.util.*;
class SampleP4{
    public static void main(String[] args) {
        System.out.println("5人のテストの点数を入力してください");
        Scanner scan = new Scanner(System.in);

        int[] test = new int[5];

        System.out.println("人数分の点数を入力してください");

        for(int i = 0; i < test.length; i++){
            System.out.print((i + 1)+"人目:");
            test[i] = scan.nextInt();
        }

        int max = test[0];
        for(int i = 0; i < test.length; i++){
            System.out.println((i + 1) + "番目の点数:"+test[i]);
            if(test[i] > max){
                max = test[i];
            }
        }
        System.out.println("最高点:"+max);
    }
}
