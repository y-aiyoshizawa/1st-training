import java.util.*;
class SampleP5{
    public static void main(String[] args) {
        System.out.println("成績を入力してください");
        Scanner scan = new Scanner(System.in);
        int res = scan.nextInt();
        switch(res){
        case 1:
            System.out.println("もっと頑張りましょう");
            break;
        case 2:
            System.out.println("もう少し頑張りましょう");
            break;
        case 3:
            System.out.println("さらに上を目指しましょう");
            break;
        case 4:
            System.out.println("大変よくできました");
            break;
        case 5:
            System.out.println("大変優秀です");
            break;
        default:
            System.out.println("1~5を入力してください");
            break;
        }
    }
}
