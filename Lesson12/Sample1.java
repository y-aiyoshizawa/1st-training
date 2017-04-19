class Sample1{
    public static void main(String[] args) {
        Vehicle1[] vd = new Vehicle1[2];

        vd[0] = new Car1(1234,12.3);
        vd[0].setSpeed(120);

        vd[1] = new Plane1(12);
        vd[1].setSpeed(120);

        for(int i = 0; i < vd.length; i++){
            vd[i].show();
        }
    }
}
abstract class Vehicle1{
    protected int speed;
    public void setSpeed(int speed){
        this.speed = speed;
        System.out.println("速度を"+this.speed+"にセット");
    }
    abstract void show();
}
class Car1 extends Vehicle1{
    private int num;
    private double gas;

    public Car1(int num, double gas){
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
class Plane1 extends Vehicle1{
    private int flight;
    public Plane1(int flight){
        this.flight = flight;
        System.out.println("便" + this.flight + "の飛行機を作成しました");
    }
    public void show(){
        System.out.println("飛行機の便は"+flight+"です");
        System.out.println("速度は"+speed+"です");
    }
}
