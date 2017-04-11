import java.io.*;
class SampleP4{
    public static void main(String[] args)throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("三角形の高さを入力してください");
        int takasa = Integer.parseInt(br.readLine());

        System.out.println("三角形の底辺ンを入力してください");
        int teihen = Integer.parseInt(br.readLine());

        System.out.println("三角形の面積:"+(double)takasa*teihen/2);
    }
}
