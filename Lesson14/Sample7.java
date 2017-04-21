import java.io.*;
import java.util.*;

public class Sample7 {
    public static void main(String[] args) {

        try{
            Scanner scan = new Scanner(System.in,"utf-8");
            PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("test.txt")));

            pw.println(scan.next());
            pw.print("world");
            System.out.println("ファイルに書き込みました");
            pw.close();

        }catch(IOException e){
            System.out.println("入出力エラーです"+e);
        }
    }
}
