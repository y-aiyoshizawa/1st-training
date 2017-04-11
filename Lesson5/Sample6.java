import java.util.*;
class Sample6{
    public static void main(String[] args) {
        System.out.println("aかbを入力してください。");
        Scanner scan = new Scanner(System.in);

        char res = scan.next().charAt(0);

        switch(res){
        case 'a':
            System.out.println("aが入力されました。");
            break;
        case 'b':
            System.out.println("bが入力されました。");
            break;
        default:
            System.out.println("aかbを入力してください。");
            break;
        //System.out.println("テスト");ここには来ない
        }
    }
}
