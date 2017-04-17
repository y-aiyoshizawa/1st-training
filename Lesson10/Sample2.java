import java.util.*;
class Sample2{
    public static void main(String[] args) {
        System.out.println("英字を入れてください");

        Scanner scan = new Scanner(System.in);
        String str = scan.next();

        String str1 = str.toUpperCase();
        String str2 = str.toLowerCase();


        System.out.println("strの大文字:" + str1);
        System.out.println("strの小文字:" + str2);
    }
}
