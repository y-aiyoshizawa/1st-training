

import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.TreeMap;

class CharacterCount{

    public static void main(String[] args){

        Map<Character,Integer> map = new TreeMap<Character,Integer>();
        Scanner scan = null;

        scan = new Scanner(System.in);


        //処理
        while(scan.hasNext()){
            String str = scan.next();
            for(int i = 0; i < str.length(); i++){
                char c = str.charAt(i);
                if(    ('0' <= c && c <= '9')
                    || ('A' <= c && c <= 'Z')
                    || ('a' <= c && c <= 'z')){
                    if(map.containsKey(c)){
                        map.put(c,map.get(c) + 1);
                    }else{
                        map.put(c,1);
                    }
                }
            }
        }


        ArrayList<Entry<Character,Integer>> list = new ArrayList<>(map.entrySet());
        Collections.sort(list, (a,b) ->b.getValue() - a.getValue());

        for(Entry<Character,Integer> e : list){
            System.out.println(e.getKey() + "=" + e.getValue());
        }


        int max = list.get(0).getValue();
        //*を表示
        for(int i = max; i > 0; i--){
            for(Entry<Character,Integer> e : list){
                if(e.getValue() >= i){
                    System.out.print("*");
                }else{
                    break;
                }
            }
            System.out.println();
        }
        //文字を表示
        for(Entry<Character,Integer> e : list){
            System.out.print(e.getKey());
        }
    }
}
