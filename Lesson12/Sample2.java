class Sample2{
    public static void main(String[] args) {
        Vehicle2[] vc = new Vehicle2[2];

        vc[0] = new Car2(1234,12.3);
        vc[0].setSpeed(120);

        vc[1] = new Plane2(12);
        vc[1].setSpeed(120);

        for(int i = 0; i < vc.length; i++){
            if(vc[i] instanceof Car2){
                System.out.println("vc["+i+"]はCar2クラスです");
            }else{
                System.out.println("vc["+i+"]はPlane2クラスです");
            }

        }
    }
}
abstract class Vehicle2{
    protected int speed;
    public void setSpeed(int speed){
        this.speed = speed;
        System.out.println("速度を"+this.speed+"にセット");
    }
    abstract void show();
}
class Car2 extends Vehicle2{
    private int num;
    private double gas;

    public Car2(int num, double gas){
        System.out.println("車を作成し");
        this.num = num;
        this.gas = gas;

        System.out.println("ナンバーに"+this.num+"をセット");
        System.out.println("ガソリンに"+this.gas+"をセット");
    }
    public void show(){
        System.out.println();
        System.out.println("車のナンバーは:" + num);
        System.out.println("ガソリンの量は:" + gas);
        System.out.println("スピードは:" + speed);
    }
}
class Plane2 extends Vehicle2{
    private int flight;
    public Plane2(int flight){
        this.flight = flight;
        System.out.println("便" + this.flight + "の飛行機を作成しました");
    }
    public void show(){
        System.out.println("飛行機の便は"+flight+"です");
        System.out.println("速度は"+speed+"です");
    }
}
