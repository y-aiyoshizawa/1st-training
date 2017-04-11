import java.io.*;
class SampleP3{
    public static void main(String[] args) throws IOException{
        System.out.println("正方形の長さを入力してください");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int i = Integer.parseInt(br.readLine());
        System.out.println("正方形の面積:"+i*i);
    }
}
