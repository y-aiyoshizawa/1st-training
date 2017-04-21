

import java.io.*;

public class Sample8 {
    public static void main(String[] args) {
        System.out.println("文字を入力してください");
        try{
            BufferedReader br = new BufferedReader(new FileReader("test.txt"));
            String str1 = br.readLine();
            String str2 = br.readLine();
            System.out.println("ファイルに書き込まれている二つの文字列は");
            System.out.println(str1);
            System.out.println(str2);
            System.out.println("です");
            br.close();

        }catch(IOException e){
            System.out.println("入出力エラーです");
        }
    }
}
