import java.util.*;
class Sample9{
    public static void main(String[] args) {
        Car9[] cars = new Car9[3];

        for(int i = 0; i < cars.length; i++){
            cars[i] = new Car9();
        }

        cars[0].setNum(1234);
        cars[0].setGas(20.5);
        cars[0].setName("１号車");

        cars[1].setNum(2345);
        cars[1].setGas(45.6);
        cars[1].setName("２号車");

        cars[2].setNum(3456);
        cars[2].setGas(34.5);
        cars[2].setName("３号車");

        for(int i = 0; i < cars.length; i++){
            System.out.println();
            System.out.println("car["+i+"]の情報");
            cars[i].show();

        }
    }
}
class Car9{
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
