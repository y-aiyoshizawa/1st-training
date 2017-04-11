import java.util.*;
class Sample7{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("あなたは男性ですか？");
        System.out.println("yまたはnを入力してください。");

        char res = scan.next().charAt(0);

        if(res == 'y' || res == 'Y'){
            System.out.println("あなたは男性ですね。");
        }else if(res == 'n' || res == 'N'){
            System.out.println("あなたは女性ですね。");
        }else{
            System.out.println("yまたはnを入力してください。");
        }
    }
}
