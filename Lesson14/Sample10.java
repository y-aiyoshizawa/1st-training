

import java.io.*;

public class Sample10 {
    public static void main(String[] args) {
        try{
            BufferedReader br = new BufferedReader(new FileReader(args[0]));
            String str = "";
            while((str = br.readLine()) != null){
                System.out.println(str);
            }
            br.close();

        }catch(IOException e){
            System.out.println("入出力エラーです");
        }
    }
}
