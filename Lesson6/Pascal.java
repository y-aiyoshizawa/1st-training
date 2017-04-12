import java.util.*;
class Pascal{
    public static void main(String[] args) {
        System.out.println("段数を入力してください");
        Scanner scan = new Scanner(System.in);
        int res = scan.nextInt();

        int[] ary1 = new int[res];

        for(int i = 0; i < res; i++){

            int[] ary2 = new int[i + 1];

            //i段落目の変数の初期化
            for(int j = 0; j < ary2.length; j++){
                if(0 == j || j == ary2.length - 1){
                    ary2[0] = 1;
                    ary2[ary2.length - 1] = 1;
                }else{
                    ary2[j] = ary1[j - 1] + ary1[j];
                }
            }

            //空白の調整
            for(int j = 0; j < res - i; j++){
                System.out.print("  ");
            }

            //表示
            int c = 0;
            boolean boo = true;
            for(int j = 0; j < (i * 2 + 1); j++){
                if(boo){
                    System.out.printf("%3d",ary2[c]);
                    c++;
                    boo = false;
                }else{
                    System.out.print(" ");
                    boo = true;
                }
            }
            for(int j = 0; j < ary2.length; j++){
                ary1[j] = ary2[j];
            }
            System.out.println();
        }
    }
}
