class SampleP4{
    public static void main(String[] args) {
        CarP4 car = new CarP4(1234,20.5);
        System.out.println(car);
    }
}
class CarP4{
    private int num;
    private double gas;
    public CarP4(int num, double gas){
        this.num = num;
        this.gas = gas;
        System.out.println("ナンバーを"+this.num+"にガソリン量を"+gas+"にしました。");
    }
    public String toString(){
        return "ナンバー"+this.num+"ガソリン量"+gas+"の車です。";
    }
}
