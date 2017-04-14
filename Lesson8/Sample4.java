class Sample4{
    public static void main(String[] args) {
        Car4 car = new Car4();

        car.setNum(1234);
        car.setGas(20.5);

    }
}

class Car4{
    int num;
    double gas;

    void setNum(int num){
        this.num = num;
        System.out.println("車のナンバーに" + this.num + "をセット");
    }
    void setGas(double gas){
        this.gas = gas;
        System.out.println("ガソリンの量に" + this.gas + "Lをセット");
    }

    void show(){
        System.out.println("車のナンバー:" + num);
        System.out.println("ガソリンの量:" + gas + "L");
    }
    void showCar(){
        System.out.println("これから車の情報を表示します。");
        show();
    }
}
