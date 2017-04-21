class Sample5{
    public static void main(String[] args) {
        Car5 car = new Car5();
        car.setNum(1234);
        try{
            car.setGas(-10);
        }catch(CarException5 e){
            System.out.println(e+"が発生しました");
        }
        car.show();
    }
}
class CarException5 extends Exception{

}
class Car5{
    private int num;
    private double gas;

    public Car5(){
        System.out.println("車を作成しました");
        num = 0;
        gas = 0.0;
    }
    public Car5(int num,double gas)throws CarException5{
        this();
        setNum(num);
        setGas(gas);
    }
    public void setNum(int num){
        if(num != 4444){
            this.num = num;
            System.out.println("車のナンバーに" + this.num + "をセット");
        }else{
            System.out.println("不吉な数字です");
        }
    }
    public void setGas(double gas) throws CarException5{
        if(0.0 < gas && gas < 100.0){
            this.gas = gas;
            System.out.println("ガソリンの量に" + this.gas + "Lをセット");
        }else{
            System.out.println("ガソリンの量が正しくありません");
            throw new CarException5();
        }
    }
    public void show(){
        System.out.println("車のナンバー:" + num);
        System.out.println("ガソリンの量:" + gas + "L");
    }
}
