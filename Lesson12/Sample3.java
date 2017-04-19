class Sample3{
    public static void main(String[] args) {
        iVehicle3[] vc = new iVehicle3[2];

        vc[0] = new Car3(1234,12.3);
        vc[1] = new Plane3(12);

        for(int i = 0; i < vc.length; i++){
            vc[i].show();
        }
    }
}
interface iVehicle3{
    void show();
}
class Car3 implements iVehicle3{
    private int num;
    private double gas;

    public Car3(int num, double gas){
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
    }
}
class Plane3 implements iVehicle3{
    private int flight;
    public Plane3(int flight){
        this.flight = flight;
        System.out.println("便" + this.flight + "の飛行機を作成しました");
    }
    public void show(){
        System.out.println("飛行機の便は"+flight+"です");
    }
}
