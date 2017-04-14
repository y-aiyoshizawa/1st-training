class Sample2{
    public static void main(String[] args) {
        Car2 car = new Car2();

        car.num = 1234;
        car.gas = 20.5;
        car.sokudo = 180.0;

        car.show();
        car.show();


    }
}

class Car2{
    int num;
    double gas;
    double sokudo;

    void show(){
        System.out.println("車のナンバー:" + num);
        System.out.println("ガソリンの量:" + gas + "L");
        System.out.println("車の速度:" + sokudo + "km");
    }
}
