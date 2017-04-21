import java.util.*;
class Sample3{
    public static void main(String[] args) {
        try{
            System.out.println("int型のtest[5]の配列を作る");
            int test[] = new int[5];
            Scanner scan = new Scanner(System.in);
            System.out.println("test[idx]:idxを入力してください");
            int idx = scan.nextInt();
            System.out.println("test["+idx+"]にを代入");
            test[idx] = 10;
            System.out.println("代入できました");
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("配列の要素を超えています");
        }finally{
            System.out.println("ここは必ず実行されます");
        }
        System.out.println("終了します");
    }
}
