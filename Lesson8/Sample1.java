class Sample1{
    public static void main(String[] args) {
        Car1 car = new Car1();

        car.num = 1234;
        car.gas = 20.5;

        System.out.println("車のナンバー:" + car.num);
        System.out.println("ガソリンの量:" + car.gas);

    }
}

class Car1{
    int num;
    double gas;
}
