class Sample6{
    public static void main(String[] args) {
        Car6[] cars = new Car6[2];
        cars[0] = new Car6(2468,24.6);
        cars[1] = new RacingCar6(1357,13.5,10);

        for(int i = 0; i < cars.length; i++){
            System.out.println();
            System.out.println("cars["+i+"]の情報");
            cars[i].show();
        }
    }
}
class Car6{
    protected int num;
    protected double gas;

    public Car6(){
        System.out.println("車を作成しました");
        num = 0;
        gas = 0.0;
    }
    public Car6(int num,double gas){
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
class RacingCar6 extends Car6{
    private int course;
    public RacingCar6(){
        System.out.println("レーシングカーを作成しました");
        course = 0;
    }
    public RacingCar6(int num, double gas,int course){
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
