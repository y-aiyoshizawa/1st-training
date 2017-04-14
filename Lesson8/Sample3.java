class Sample3{
    public static void main(String[] args) {
        Car3 car = new Car3();

        car.num = 1234;
        car.gas = 20.5;
        car.sokudo = 180.0;

        car.showCar();

    }
}

class Car3{
    int num;
    double gas;
    double sokudo;

    void show(){
        System.out.println("車のナンバー:" + num);
        System.out.println("ガソリンの量:" + gas + "L");
        System.out.println("車の速度:" + sokudo + "km");
    }
    void showCar(){
        System.out.println("これから車の情報を表示します。");
        show();
    }
}
