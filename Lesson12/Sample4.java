class Sample4{
    public static void main(String[] args) {
        Car4 car = new Car4(1234,12.3);
        car.vshow();
        car.mshow();
    }
}
interface iVehicle4{
    void vshow();
    void show();
}
interface iMaterial4{
    void mshow();
    void show();
}
class Car4 implements iVehicle4,iMaterial4{
    private int num;
    private double gas;

    public Car4(int num, double gas){
        System.out.println("車を作成し");
        this.num = num;
        this.gas = gas;

        System.out.println("ナンバーに"+this.num+"をセット");
        System.out.println("ガソリンに"+this.gas+"をセット");
    }
    public void vshow(){
        System.out.println();
        System.out.println("車のナンバーは:" + num);
        System.out.println("ガソリンの量は:" + gas);
    }
    public void mshow(){
        System.out.println("車の材質は鉄です");
    }
    public void show(){
        System.out.println("aaa");
    }
}
