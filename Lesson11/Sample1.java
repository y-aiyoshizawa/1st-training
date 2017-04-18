class Sample1{
    public static void main(String[] args) {
        RacingCar1 rcar = new RacingCar1();
        rcar.setNum(1234);
        rcar.setGas(12.3);
        rcar.setCourse(10);
        rcar.show();
    }
}
class Car1{
    private int num;
    private double gas;

    public Car1(){
        System.out.println("車を作成しました");
        num = 0;
        gas = 0.0;
    }
    public Car1(int num,double gas){
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
class RacingCar1 extends Car1{
    private int course;
    public RacingCar1(){
        course = 0;
        System.out.println("レーシングカーを作成しました");
    }
    public void setCourse(int course){
        this.course = course;
        System.out.println("コース番号に"+this.course+"をセット");
    }
}
