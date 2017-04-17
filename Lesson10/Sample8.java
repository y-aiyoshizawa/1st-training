import java.util.*;
class Sample8{
    public static void main(String[] args) {
        Car8 car1;
        System.out.println("car1を宣言");
        car1 = new Car8();
        car1.setNum(1234);
        car1.setGas(20.5);
        car1.setName("１号車");
        System.out.println("car1の情報");
        car1.show();
    }
}
class Car8{
    private int num;
    private double gas;
    private String name;

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
    public void setName(String name){
        this.name = name;
        System.out.println("車の名前に" + name + "をセット");
    }
    public void show(){
        System.out.println("車のナンバー:" + num);
        System.out.println("ガソリンの量:" + gas + "L");
        System.out.println("車の名前:" + name);
    }
}
