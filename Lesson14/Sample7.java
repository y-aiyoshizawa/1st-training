import java.io.*;

public class Sample7 {
    public static void main(String[] args) {

        try{
            PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("test.txt")));
            
            pw.println("hello");
            pw.print("world");
            System.out.println("ファイルに書き込みました");
            pw.close();
            
        }catch(IOException e){
            System.out.println("入出力エラーです");
        }
    }
}
