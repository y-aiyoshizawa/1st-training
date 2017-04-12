import java.util.*;

class Sample5{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int res = scan.nextInt();



        switch(res){
        case 1:
            System.out.println("1が入力されました。");
            break;
        case 2:
            System.out.println("2が入力されました。");
            break;
        default:
            System.out.println("1か2を入力してください。");
            break;
        }

    }
}
