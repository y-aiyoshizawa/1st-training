import java.util.*;
class SampleP2{
    public static void main(String[] args) {
        System.out.println("文字列を入力しください");

        Scanner scan = new Scanner(System.in);
        String str = scan.next();

        StringBuffer sb = new StringBuffer(str);
        sb.reverse();
        //中身を逆順にしている！！
        System.out.println(str + "を逆にすると" + sb);
    }
}
