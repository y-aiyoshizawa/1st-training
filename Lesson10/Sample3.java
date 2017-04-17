import java.util.*;
class Sample3{
    public static void main(String[] args) {
        System.out.println("文字列を入力してください");

        Scanner scan = new Scanner(System.in);
        String str = scan.next();

        System.out.println("検索する文字列を入力してください");
        String search = scan.next();

        int idx = str.indexOf(search);
        if(idx != -1){
            System.out.println(search + "は" + (idx + 1) + "～" + (idx + search.length() + 1) + "番目に見つかりました");
        }else{
            System.out.println(search + "は見つかりませんでした");
        }
    }
}
