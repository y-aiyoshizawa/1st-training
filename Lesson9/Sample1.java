class Sample1{
    public static void main(String[] args) {
        Car1 car = new Car1();

        car.num = 4444;
        car.gas = -10.0;

        car.show();
    }
}

class Car1{
    int num;
    double gas;

    void show(){
        System.out.println("車のナンバー:" + num);
        System.out.println("ガソリンの量:" + gas + "L");
    }
}
