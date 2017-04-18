import java.util.*;
class CharacterCount{
    public static void main(String[] args){
        Map<Character,Integer> map = new TreeMap<Character,Integer>();

        Scanner scan= new Scanner(System.in);

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

        //最大値を取得
        int max = 0;
        for(char key: map.keySet()){
            if(map.get(key) > max){
                max = map.get(key);
            }
        }
        //*を表示
        for(int i = max; i >= 0; i--){
            for(char key: map.keySet()){
                if(map.get(key) >= i){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        //文字を表示
        for(char key: map.keySet()){
            System.out.print(key);
        }
    }
}
