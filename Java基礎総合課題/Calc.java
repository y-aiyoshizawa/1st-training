import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;

//10*3/5　結果:0を何とかする
public class Calc {
    static int[] vars = new int[255];
    public static void main(String[] args) {
        System.out.println("対話型電卓を開始します。");
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            Queue<String> polishQueue = new ArrayDeque<>();

            while(true){
                System.out.print("入力 >");
                String formula = br.readLine();

                if(formula.toLowerCase().equals("exit")){
                    break;
                }

                try{
                    polishQueue = reversePolish(formula);
                    int sum = compute(polishQueue);
                    System.out.println("出力 >" + sum);
                } catch (FormulaException e) {
                    System.out.println("出力 >----------文法エラー----------");
                    System.out.println("　　 >変数");
                    System.out.println("　　 >[数値|変数] 演算子 [数値|変数]");
                    System.out.println("　　 >[数値|変数] 演算子 [数値|変数] 演算子 [数値|変数]");
                    System.out.println("　　 >変数 代入 [数値|変数]");
                    System.out.println("　　 >変数 代入 [数値|変数] 演算子 [数値|変数]");
                    System.out.println("　　 >変数 代入 [数値|変数] 演算子 [数値|変数] 演算子 [数値|変数]");
                    System.out.println("　　 >上記の形式で入力してください。");
                    System.out.println("　　 >変数に使える文字はA～Z,a～zの英字一文字です。");
                    System.out.println("　　 >------------------------------");
                }catch(ArithmeticException e){
                    if(e.getMessage().equals("/ by zero")){
                        System.out.println("出力 >0で除算することは出来ません。");
                    }else{
                        System.out.println("出力 >計算結果がオーバーフローしてしまいました。");
                        System.out.println("　　 >計算できる範囲は"+Integer.MIN_VALUE+"～"+Integer.MAX_VALUE+"です。");
                    }
                }catch(NumberFormatException e){
                    System.out.println("出力 >入力した値が大きすぎます。");
                    System.out.println("　　 >0～" + Integer.MAX_VALUE + "の値を入力してください。");
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("計算を終了します。");

    }

    //Stringの式を逆ポーランド記法に変換し、Queueで返す
    public static Queue<String> reversePolish(String formula)
    throws FormulaException{
        formula = formula.replaceAll("\\s+", "");  //ブランクの削除
        //文法チェック
        if(!(
            formula.matches("[a-zA-Z]") ||
            formula.matches("(\\d+|[a-zA-Z])([*+-/](\\d+|[a-zA-Z])){1,2}") ||
            formula.matches("[a-zA-Z]=(\\d+|[a-zA-Z])") ||
            formula.matches("[a-zA-Z]=(\\d+|[a-zA-Z])([*+-/](\\d+|[a-zA-Z])){1,2}")
        )){
            //文法エラー
            throw new FormulaException();
        }


        String[] words = formula.replaceAll("(\\d+|[a-zA-Z]|[*+-/=])","$1,").split(",");    //式を単語に分解する
        Queue<String> polishQueue = new ArrayDeque<>();     //逆ポーランド記法が入るキュー
        Deque<String> operatorStack = new ArrayDeque<>();   //一時的に演算子を入れておくスタック

        //代入の場合の処理
        int i = 0;
        if(words.length > 1 && words[1].equals("=")){
            operatorStack.push(words[0]);
            operatorStack.push(words[1]);
            i = 2;
        }

        for(;i < words.length; i++){
            String word = words[i];
            if(word.matches("\\d+|[a-zA-Z]")){
                //数字|変数ならキューにwordを追加
                polishQueue.add(word);
            }else if(word.matches("[+-]")){
                //+-ならスタックにwordを入れる
                operatorStack.push(word);
            }else if(word.matches("[/*]")){
                //"*""/"ならiをi+1のwordsの値をにキューに入れる
                //そのあとwordをキューに入れる
                polishQueue.add(words[++i]);
                polishQueue.add(word);
            }
        }
        while(!operatorStack.isEmpty()){
            //スタックに残っているものをキューに追加
            polishQueue.add(operatorStack.pop());
        }
        return polishQueue;
    }

    //逆ポーランド記述のQueueを計算して表示する
    public static int compute(Queue<String> polishQueue)
         throws ArithmeticException,NumberFormatException{

        Deque<String> compStack = new ArrayDeque<>();

        while(!polishQueue.isEmpty()){
            String word = polishQueue.poll();
            if(word.matches("\\d+")){
                //数字ならそののままスタックに入れる
                compStack.push(word);
            }else if(word.matches("[a-zA-Z]")){
                //変数なら変数に入っている値をスタックに入れる
                compStack.push(String.valueOf(vars[word.charAt(0)]));
            }else if(word.matches("[*+-/]")){
                //*+-/にあった計算をする
                int num1 = Integer.parseInt(compStack.pop());
                int num2 = Integer.parseInt(compStack.pop());
                switch(word){
                case "+":
                    compStack.push(String.valueOf(Math.addExact(num2, num1)));
                    break;
                case "-":
                    compStack.push(String.valueOf(Math.subtractExact(num2, num1)));
                    break;
                case "*":
                    compStack.push(String.valueOf(Math.multiplyExact(num2, num1)));
                    break;
                case "/":
                    compStack.push(String.valueOf(num2 / num1));
                    break;
                }
            }else if(word.equals("=")){
                //=ならスタックの値(合計)と入れる変数を取り出し変数に合計を入れる
                String var = polishQueue.poll();
                String sum = compStack.peek();
                vars[var.charAt(0)] = Integer.parseInt(sum);
            }
        }
        return Integer.parseInt(compStack.pop());
    }
}

//文法エラーの例外
class FormulaException extends Exception{
    public FormulaException() {}
    public FormulaException(String str){
        super(str);
    }
}
