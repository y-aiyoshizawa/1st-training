import java.util.*;
class Sample1{
    public static void main(String[] args) {
        String str = "hello";

        char ch1 = str.charAt(0);
        char ch2 = str.charAt(1);

        int len = str.length();

        System.out.println("strの１文字目:" + ch1);
        System.out.println("strの２文字目:" + ch2);
        System.out.println("strの文字列の長さ" + len);
    }
}
