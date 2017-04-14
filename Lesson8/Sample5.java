class Sample5{
    public static void main(String[] args) {
        Car5 car = new Car5();

        car.setNumGas(1234,20.5);

    }
}

class Car5{
    int num;
    double gas;

    void setNumGas(int num,double gas){
        this.num = num;
        this.gas = gas;
        System.out.println("車のナンバーに" + this.num + "をセット");
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
