import java.io.*;
class SampleP5{
    public static void main(String[] args)throws IOException {

        int sum = 0;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("科目の１～５の点数を入力してください。");
        for(int i = 0; i < 5; i ++){
            sum += Integer.parseInt(br.readLine());
        }
        System.out.println("５科目の合計:"+sum);
        System.out.println("５科目の平均:"+(double)sum/5);
    }
}
