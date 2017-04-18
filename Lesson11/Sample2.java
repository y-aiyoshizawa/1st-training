class Sample2{
    public static void main(String[] args) {
        RacingCar2 rcar = new RacingCar2(1234,12.3,10);
        rcar.show();
    }
}
class Car2{
    private int num;
    private double gas;

    public Car2(){
        System.out.println("車を作成しました");
        num = 0;
        gas = 0.0;
    }
    public Car2(int num,double gas){
        this();
        setNum(num);
        setGas(gas);
    }
    public void setNum(int num){
        if(num != 4444){
            this.num = num;
            System.out.println("車のナンバーに" + this.num + "をセット");
        }else{
            System.out.println("不吉な数字です");
        }
    }
    public void setGas(double gas){
        if(0.0 < gas && gas < 100.0){
            this.gas = gas;
            System.out.println("ガソリンの量に" + this.gas + "Lをセット");
        }else{
            System.out.println("ガソリンの量が正しくありません");
        }
    }
    public void show(){
        System.out.println("車のナンバー:" + num);
        System.out.println("ガソリンの量:" + gas + "L");
    }
}
class RacingCar2 extends Car2{
    private int course;
    public RacingCar2(){
        System.out.println("レーシングカーを作成しました");
        course = 0;
    }
    public RacingCar2(int num, double gas,int course){
        super(num,gas);
        System.out.println("レーシングカーを作成しました");
        setCourse(course);
    }
    public void setCourse(int course){
        this.course = course;
        System.out.println("コース番号に"+this.course+"をセット");
    }
}
