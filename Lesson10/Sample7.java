import java.util.*;
class Sample7{
    public static void main(String[] args) {
        Car7 car1;
        System.out.println("car1を宣言");
        car1 = new Car7();
        car1.setNum(1234);
        car1.setGas(20.5);

        Car7 car2;
        System.out.println("car2を宣言");

        car2 = car1;
        System.out.println("car2 = car1;を実行");

        System.out.println("car1の情報");
        car1.show();
        System.out.println("car2の情報");
        car2.show();

        System.out.println();
        System.out.println("car1の内容を変更");
        car1.setNum(2345);
        car1.setGas(1.0);

        System.out.println("car1の情報");
        car1.show();
        System.out.println("car2の情報");
        car2.show();
    }
}
class Car7{
    private int num;
    private double gas;

    public void setGas(double gas){
        if(0.0 < gas && gas < 100.0){
            this.gas = gas;
            System.out.println("ガソリンの量に" + this.gas + "Lをセット");
        }else{
            System.out.println("ガソリンの量が正しくありません");
        }
    }
    public void setNum(int num){
        if(num != 4444){
            this.num = num;
            System.out.println("車のナンバーに" + this.num + "をセット");
        }else{
            System.out.println("不吉な数字です");
        }
    }
    public void show(){
        System.out.println("車のナンバー:" + num);
        System.out.println("ガソリンの量:" + gas + "L");
    }
}
