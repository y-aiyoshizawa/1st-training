import java.util.*;
class Sample4{
    public static void main(String[] args) {
        System.out.println("文字列を入力してください");

        Scanner scan = new Scanner(System.in);
        String str1 = scan.next();

        System.out.println("追加する文字列を入力してください");
        String str2 = scan.next();

        StringBuffer br = new StringBuffer(str1);
        br.append(str2);

        System.out.println(str1 + "に" + str2 + "を追加すると" + br + "です");
    }
}
