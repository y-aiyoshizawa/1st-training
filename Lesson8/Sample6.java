class Sample6{
    public static void main(String[] args) {
        Car6 car = new Car6();

        car.setNumGas(1234,20.5);

        int num = car.getNum();
        double gas = car.getGas();

        System.out.println("車のナンバーは" + num + "です");
        System.out.println("ガソリンの量は" + gas + "です");

    }
}

class Car6{
    int num;
    double gas;

    void setNumGas(int num,double gas){
        this.num = num;
        this.gas = gas;
        System.out.println("車のナンバーに" + this.num + "をセット");
        System.out.println("ガソリンの量に" + this.gas + "Lをセット");
    }
    int getNum(){
        System.out.println("車のナンバーを調べました");
        return num;
    }
    double getGas(){
        System.out.println("車のガソリンの量を調べました");
        return gas;
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
