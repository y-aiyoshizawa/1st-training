import java.util.*;

class Sample10{
    public static void main(String[] args) {
        System.out.println("成績を入力してください");
        Scanner scan = new Scanner(System.in);

        int res = scan.nextInt();
        switch(res){
        case 1:
        case 2:
            System.out.println("もう少し頑張りましょう");
            break;
        case 3:
        case 4:
            System.out.println("この調子で頑張りましょう");
            break;
        case 5:
            System.out.println("大変優秀です");
            break;
        default:
            System.out.println("1~5までの数字を入力してください");
            break;
        }
    }
}
