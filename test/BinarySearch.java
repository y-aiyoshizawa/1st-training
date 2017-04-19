import java.util.*;

class BinarySearch{
    public static void main(String[] args) {


        //値の初期化
        int[] ary = {1,2,4,5,5,6};

        for(int i = 0; i < ary.length; i++){
            System.out.print(ary[i]+",");
        }
        System.out.println();
        System.out.println("探す値を入力してください");
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();

        //２分探査
        int max = ary.length - 1;
        int min = 0;

        while(true){
            int idx = (max + min) / 2;
            System.out.println("min:"+min+",max:"+max+",idx:"+idx);
            if(ary[idx] == t){
                //見つかった場合
                System.out.println("ary["+idx+"]="+ary[idx]);
                break;
            }else if(ary[idx] > t){
                max = idx - 1;
            }else{
                min = idx + 1;
            }
            if(min > max){
                System.out.println("値は見つかりませんでした");
                break;
            }
        }
    }
}
