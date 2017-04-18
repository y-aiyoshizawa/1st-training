import java.util.*;
class SampleP3{
    public static void main(String[] args) {
        System.out.println("文字列を入力しください");

        Scanner scan = new Scanner(System.in);
        String str = scan.next();

        StringBuffer sb = new StringBuffer(str);
        System.out.println("aを挿入する位置を整数で入力してください");

        int idx = scan.nextInt();

        sb.insert(idx,"a");
        System.out.println(sb + "になりました");
    }
}
