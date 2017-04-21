import java.io.*;

public class Sample6 {
    public static void main(String[] args) {
        System.out.println("文字を入力してください");
        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String str = br.readLine();
            System.out.println("入力された文字:"+str);

        }catch(IOException e){
            System.out.println("入出力エラーです");
        }
    }
}
