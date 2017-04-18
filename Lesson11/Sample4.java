class Sample4{
    public static void main(String[] args) {
        RacingCar4 rcar = new RacingCar4(1234,12.3,10);
        rcar.show();
    }
}
class Car4{
    protected int num;
    protected double gas;

    public Car4(){
        System.out.println("車を作成しました");
        num = 0;
        gas = 0.0;
    }
    public Car4(int num,double gas){
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
class RacingCar4 extends Car4{
    private int course;
    public RacingCar4(){
        System.out.println("レーシングカーを作成しました");
        course = 0;
    }
    public RacingCar4(int num, double gas,int course){
        super(num,gas);
        System.out.println("レーシングカーを作成しました");
        setCourse(course);
    }
    public void setCourse(int course){
        this.course = course;
        System.out.println("コース番号に"+this.course+"をセット");
    }
    public void show(){
        System.out.println("レーシングカーのナンバー:" + num);
        System.out.println("カーのガソリンの量:" + gas + "L");
        System.out.println("コース番号:"+course);
    }
}
